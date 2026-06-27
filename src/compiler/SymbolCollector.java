package compiler;

import jhp.parser.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class SymbolCollector extends JhpParserBaseVisitor<Void> {

    private GlobalSymbolTable table = new GlobalSymbolTable();
    private String currentNamespace = null;                     // 当前命名空间，如 "com.huajie.app.domain"
    private Map<String, String> imports = new HashMap<>();      // 别名 -> 全限定类名（Java风格）

    private String currentClassName = null;

    public GlobalSymbolTable getTable() {
        return table;
    }

    // ========== 命名空间和导入 ==========

    @Override
    public Void visitNamespaceDeclaration(JhpParser.NamespaceDeclarationContext ctx) {
        String fullName = ctx.namespaceNameList().getText().replace("\\", ".");
        this.currentNamespace = fullName;
        return null;
    }

    @Override
    public Void visitImportStatement(JhpParser.ImportStatementContext ctx) {
        // importPath 规则：identifier ('\\' identifier)*
        JhpParser.ImportPathContext pathCtx = ctx.importPath();
        String fullPath = pathCtx.getText().replace("\\", ".");
        // 取最后一个标识符作为别名
        String alias = fullPath.substring(fullPath.lastIndexOf('.') + 1);
        // 如果路径以 ".*" 结尾，当前不处理通配符，简单记录
        if (fullPath.endsWith(".*")) {
            // 暂不处理，等以后完善
        } else {
            imports.put(alias, fullPath);
        }
        return null;
    }

    /**
     * 将短类名（或已带命名空间前缀）解析为全限定 Java 类名。
     * 优先查找导入表，其次尝试拼接当前命名空间。
     */
    private String resolveClassName(String maybeGeneric) {
        // 分离泛型部分
        String base = maybeGeneric;
        String genericPart = "";
        int genericStart = base.indexOf('<');
        if (genericStart != -1) {
            genericPart = base.substring(genericStart);
            base = base.substring(0, genericStart);
        }
        // 对基类名进行解析
        if (!base.contains(".")) {
            if (imports.containsKey(base)) {
                base = imports.get(base);
            } else if (currentNamespace != null && !currentNamespace.isEmpty()) {
                base = currentNamespace + "." + base;
            }
        }
        return base + genericPart;
    }

    /**
     * 将 typeHint 转换为包含完整包名的 Java 类型字符串，并处理泛型。
     */
    private String resolveTypeHint(JhpParser.TypeHintContext typeHint) {
        if (typeHint == null) return "void";
        if (typeHint.primitiveType() != null) {
            return JhpUtils.mapJhpTypeToJavaType(typeHint.primitiveType().getText());
        }
        if (typeHint.qualifiedStaticTypeRef() != null) {
            JhpParser.QualifiedStaticTypeRefContext qsr = typeHint.qualifiedStaticTypeRef();
            // 获取类名部分（可能包含命名空间）
            String className = qsr.qualifiedNamespaceName().getText().replace("\\", ".");
            className = resolveClassName(className);
            // 处理泛型参数
            StringBuilder sb = new StringBuilder(className);
            if (qsr.genericDynamicArgs() != null) {
                JhpParser.GenericDynamicArgsContext ga = qsr.genericDynamicArgs();
                if (ga.typeRef() != null && !ga.typeRef().isEmpty()) {
                    sb.append("<");
                    for (int i = 0; i < ga.typeRef().size(); i++) {
                        if (i > 0) sb.append(", ");
                        sb.append(resolveTypeRef(ga.typeRef(i)));
                    }
                    sb.append(">");
                }
            }
            return sb.toString();
        }
        return "Object";   // Callable 或其他
    }

    private String resolveTypeRef(JhpParser.TypeRefContext typeRef) {
        if (typeRef.primitiveType() != null) {
            return JhpUtils.mapJhpTypeToJavaType(typeRef.primitiveType().getText());
        }
        if (typeRef.qualifiedNamespaceName() != null) {
            String className = typeRef.qualifiedNamespaceName().getText().replace("\\", ".");
            className = resolveClassName(className);
            if (typeRef.genericDynamicArgs() != null) {
                className += "<" + mapTypeRefList(typeRef.genericDynamicArgs().typeRef()) + ">";
            }
            return className;
        }
        if (typeRef.indirectTypeRef() != null || typeRef.Static() != null || typeRef.anonymousClass() != null) {
            return "Object";
        }
        return "Object";
    }

    private String mapTypeRefList(List<JhpParser.TypeRefContext> list) {
        List<String> parts = new ArrayList<>();
        for (JhpParser.TypeRefContext tr : list) {
            parts.add(resolveTypeRef(tr));
        }
        return String.join(", ", parts);
    }

    // ========== 类定义收集 ==========

    @Override
    public Void visitClassDeclaration(JhpParser.ClassDeclarationContext ctx) {
        // 计算完整类名
        String simpleName = ctx.identifier().getText();
        String fullClassName = (currentNamespace != null && !currentNamespace.isEmpty())
                ? currentNamespace + "." + simpleName
                : simpleName;
        this.currentClassName = fullClassName;
        boolean isInterface = ctx.Interface() != null;

        // 泛型参数
        List<String> typeParams = new ArrayList<>();
        if (ctx.typeParameterListInBrackets() != null) {
            JhpParser.TypeParameterListContext listCtx = ctx.typeParameterListInBrackets().typeParameterList();
            if (listCtx != null) {
                for (JhpParser.TypeParameterDeclContext decl : listCtx.typeParameterDecl()) {
                    typeParams.add(decl.identifier().getText());
                }
            }
        }
        table.addClass(fullClassName, typeParams);

        // 父类（仅类有）
        if (!isInterface && ctx.Extends() != null && ctx.qualifiedStaticTypeRef() != null) {
            String superClass = ctx.qualifiedStaticTypeRef().getText().replace("\\", ".");
            superClass = resolveClassName(superClass);
            table.setSuperClass(fullClassName, superClass);
        }

        // 实现接口
        if (ctx.Implements() != null && ctx.interfaceList() != null) {
            List<String> ifaces = new ArrayList<>();
            for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()) {
                String ifaceName = iface.getText().replace("\\", ".");
                ifaceName = resolveClassName(ifaceName);
                ifaces.add(ifaceName);
            }
            table.setInterfaces(fullClassName, ifaces);
        }

        // 接口继承接口
        if (isInterface && ctx.Extends() != null && ctx.interfaceList() != null) {
            List<String> ifaces = new ArrayList<>();
            for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()) {
                String ifaceName = iface.getText().replace("\\", ".");
                ifaceName = resolveClassName(ifaceName);
                ifaces.add(ifaceName);
            }
            table.setInterfaces(fullClassName, ifaces);
        }

        visitChildren(ctx);
        currentClassName = null;
        return null;
    }

    // ========== 方法收集 ==========

    @Override
    public Void visitClassStatement(JhpParser.ClassStatementContext ctx) {
        if (ctx.Function_() != null && currentClassName != null) {
            String methodName = ctx.identifier().getText();
            // 返回类型
            String returnType = "void";
            if (ctx.returnTypeDecl() != null && ctx.returnTypeDecl().typeHint() != null) {
                returnType = resolveTypeHint(ctx.returnTypeDecl().typeHint());
            }
            // 参数类型列表
            List<String> paramTypes = new ArrayList<>();
            if (ctx.formalParameterList() != null) {
                for (JhpParser.FormalParameterContext param : ctx.formalParameterList().formalParameter()) {
                    String ptype = "Object";
                    if (param.typeHint() != null) {
                        ptype = resolveTypeHint(param.typeHint());
                    }
                    paramTypes.add(ptype);
                }
            }
            table.addMethod(currentClassName, methodName, returnType, paramTypes);
        }
        return null;
    }
}