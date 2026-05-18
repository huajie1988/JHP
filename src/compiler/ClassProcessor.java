package compiler;

import jhp.parser.JhpParser;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ClassProcessor {
    private ExpressionProcessor exprProc;
    private VariableProcessor varProc;
    private PrintWriter out;
    private int indent;
    private boolean insideClass = false;   // 是否在类内部
    private final JhpVisitor visitor;

    public ClassProcessor(
            VariableProcessor varProc,
            ExpressionProcessor exprProc,
            JhpVisitor visitor,
            PrintWriter out) {
        this.varProc = varProc;
        this.exprProc = exprProc;
        this.out = out;
        this.visitor = visitor;
        varProc.setExprProcessor(exprProc);

    }

    public Void process(JhpParser.ClassDeclarationContext ctx, int indentLevel) {
        this.indent = indentLevel;
        // 提取类名和类型
        String className = ctx.identifier().getText();
        boolean isInterface = ctx.Interface() != null;

        if (ctx.attributes() != null) {
            // 属性声明
            generateClassAttribute(ctx.attributes());

        }

        // 修饰符：abstract, final 等
        String modifiers = "";

        if (ctx.Public() != null) {
            modifiers += "public ";
        } else if (ctx.Protected() != null) {
            modifiers += "protected ";
        } else if (ctx.Private() != null) {
            modifiers += "private ";
        } else {
            //其他不写
            modifiers += "";
        }

        if (ctx.modifier() != null) {
            modifiers += ctx.modifier().getText() + " ";
        }

        String extendsClause = "";
        // 接口多继承，类单继承
        if(isInterface){
            if(ctx.Extends() != null && ctx.interfaceList() != null){
                List<String> ifaces = new ArrayList<>();
                for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()){
                    ifaces.add(JhpUtils.phpPackageToJavaPackage(iface.getText()));
                }
                extendsClause = " extends " + String.join(", ", ifaces);
            }
        }else {
            if (ctx.Extends() != null && ctx.qualifiedStaticTypeRef() != null) {
                extendsClause = " extends " + JhpUtils.phpPackageToJavaPackage(ctx.qualifiedStaticTypeRef().getText());
            }
        }

        // implements
        String implementsClause = "";
        if (ctx.Implements() != null && ctx.interfaceList() != null) {
            List<String> ifaces = new ArrayList<>();
            for (JhpParser.QualifiedStaticTypeRefContext iface : ctx.interfaceList().qualifiedStaticTypeRef()) {
                ifaces.add(JhpUtils.phpPackageToJavaPackage(iface.getText()));
            }
            implementsClause = " implements " + String.join(", ", ifaces);
        }

        varProc.setCurrentClassName(className);

        // 输出类头
        JhpUtils.printIndent(out, indent);
        String classType = "class";
        if(isInterface) {
            classType = "interface";
        }

        // 如果走了interface，则这里ctx.classEntryType是null
        if(!isInterface && ctx.classEntryType() != null && ctx.classEntryType().Trait() != null) {
            System.err.println("Warning: trait is not directly supported, treating as class");
            classType = "class"; // Java 没有 trait，暂当作普通类处理
        }

        out.println(modifiers + classType+" " + className + extendsClause + implementsClause + " {");
        indent++;

        insideClass = true;

        // 翻译类成员
        for (JhpParser.ClassStatementContext stmt : ctx.classStatement()) {
            translateClassStatement(stmt, ctx);
        }

        insideClass = false;
        indent--;
        JhpUtils.printIndent(out, indent);
        out.println("}");
        varProc.setCurrentClassName(null);
        return null;
    }


    private void generateClassAttribute(JhpParser.AttributesContext ctx) {
        JhpUtils.generateClassAttribute(ctx, out, indent);
    }

    private void translateClassStatement(JhpParser.ClassStatementContext stmt,JhpParser.ClassDeclarationContext ctx) {
        if (stmt.Use() != null) {
            // trait use，暂不支持
            JhpUtils.printIndent(out, indent);
            out.println("The trait use statement is not supported yet; skipping.");
            return;
        }

        // 成员变量声明
        if (stmt.propertyModifiers() != null) {
            generateClassMemberVariable(stmt);
            return;
        }

        // 常量声明
        if (stmt.Const() != null) {
            generateClassConst(stmt);
            return;
        }

        // 函数声明
        if (stmt.Function_() != null) {
            generateClassMethod(stmt, ctx);
            return;
        }

    }

    private void generateClassMemberVariable(JhpParser.ClassStatementContext stmt) {

        // 先处理 Attributes（例如 #[JavaDoc(@Autowired)]）
        if (stmt.attributes() != null) {
            generateClassAttribute(stmt.attributes());
        }

        // 语法文件去除了var修饰，因为PHP7后var默认就是public
        String accessModifier = "public "; // PHP 默认 public
        JhpParser.MemberModifiersContext modifiersCtx = stmt.propertyModifiers().memberModifiers();
        if (modifiersCtx != null) {
            accessModifier = JhpUtils.extractAccessModifier(modifiersCtx);
        }
        String type = "Object"; // 默认类型
        if (stmt.typeHint() != null) {
            type = JhpUtils.mapTypeHint(stmt.typeHint());
        }
        // 处理多个 variableInitializer（用逗号分隔）
        for (JhpParser.VariableInitializerContext varInit : stmt.variableInitializer()) {
            String varName = varInit.VarName().getText().substring(1); // 去掉 $
            String init = "";
            if (varInit.Eq() != null && varInit.constantInitializer() != null) {
                init = " = " + exprProc.generateConstantInitializer(varInit.constantInitializer(), indent);
                // constantInitializer 内部可能是一个 expression，也可能嵌套 array 等，但 generateExpression 可处理
            }
            JhpUtils.printIndent(out, indent);
            out.println(accessModifier + type + " " + varName + init + ";");
            varProc.setVariableType(varName, type);  // <-- 新增：向符号表注册成员名→类型
        }
    }

    private void generateClassConst(JhpParser.ClassStatementContext stmt) {

        String type = null;

        if (stmt.typeHint() != null) {
            type = JhpUtils.mapTypeHint(stmt.typeHint());
        }

        List<JhpParser.IdentifierInitializerContext> idInits = stmt.identifierInitializer();

        if (type == null && !idInits.isEmpty()) {
            // 无显式类型，遍历初始化器，只保留最后一条有效推断
            String inferredType = "Object";
            for (JhpParser.IdentifierInitializerContext idInit : idInits) {
                if (idInit.constantInitializer() != null) {
                    String t = exprProc.inferTypeFromConstantInitializer(idInit.constantInitializer());
                    if (t != null) {
                        inferredType = t;
                    }
                }
            }
            type = inferredType;
        } else if (type == null) {
            type = "Object";
        }


        for (JhpParser.IdentifierInitializerContext idInit : idInits) {
            String constName = idInit.identifier().getText();
            String init = "";
            if (idInit.constantInitializer() != null) {
                String initCode = exprProc.generateConstantInitializer(idInit.constantInitializer(), indent);
                init = " = " + initCode;
            }
            JhpUtils.printIndent(out, indent);
            out.println("public static final " + type + " " + constName + init + ";");
        }
    }

    private void generateClassMethod(JhpParser.ClassStatementContext stmt,JhpParser.ClassDeclarationContext ctx) {
        if(stmt.attributes()!=null){
            generateClassAttribute(stmt.attributes());
        }

        // 提取修饰符（public/private/protected/static/abstract/final）
        String modifiers = JhpUtils.extractMethodModifiers(stmt.memberModifiers());
        String methodName = stmt.identifier().getText();
        boolean isInterface = ctx.Interface() != null;
        boolean isConstructor = JhpUtils.isConstructor(methodName);
        boolean isMain = JhpUtils.isMain(methodName);
        if (isConstructor) {
            methodName = varProc.getCurrentClassName();   // 需要能获取到当前类名
        }

        // 处理参数列表，并将参数注册到符号表
        List<String> paramStrs = new ArrayList<>();
        if (stmt.formalParameterList() != null) {
            for (JhpParser.FormalParameterContext param : stmt.formalParameterList().formalParameter()) {
                String paramType = "Object";
                String annotation = JhpUtils.generateParameterAnnotations(param);
                Boolean isVarArg = param.Ellipsis() != null;
                if (param.typeHint() != null) {
                    paramType = JhpUtils.mapTypeHint(param.typeHint());
                }
                paramType = paramType + (isVarArg ? "..." : "");
                String varName = param.variableInitializer().VarName().getText().substring(1); // 去掉 $
                paramStrs.add(annotation + " " + paramType + " " + varName);
                varProc.setVariableType(varName, paramType);

            }
        }
        String params = String.join(", ", paramStrs);

        // 返回类型
        String returnType = "void";
        // System.err.println("DEBUG: Checking return type hint for method " + stmt.returnTypeDecl());
        if (stmt.returnTypeDecl() != null && stmt.returnTypeDecl().typeHint() != null) {
            // System.err.println("DEBUG: Mapping return type hint for method " + stmt.returnTypeDecl().typeHint());
            returnType = JhpUtils.mapTypeHint(stmt.returnTypeDecl().typeHint());
        }
        // 构造函数没有返回类型
        if(isConstructor) {
            returnType = "";
        }

        // 根据方法体类型生成代码
        JhpParser.MethodBodyContext body = stmt.methodBody();
        if (body != null) {
            if (body.SemiColon() != null) {
                // 抽象方法（无方法体）
                JhpUtils.printIndent(out, indent);
                out.println(modifiers + returnType + " " + methodName + "(" + params + ");");
            } else if (body.blockStatement() != null) {
                // 如果声明了 abstract 但又有方法体，发出警告并去掉 abstract 修饰符
                if(modifiers.contains("abstract")) {
                    System.err.println("Warning: method " + methodName + " has a body but is declared abstract. Removing abstract modifier.");
                    modifiers = modifiers.replace("abstract", "");
                }


                // 具体方法
                JhpUtils.printIndent(out, indent);
                if(isInterface){
                    //接口只保留函数定义
                    System.err.println("Warning: method " + methodName + " is declared in an interface but has a body. Removing method body.");
                    out.println(modifiers + returnType + " " + methodName + "(" + params + ");");
                }else{
                    if(isMain){
                        // main 方法硬编码为 public static void main(String[] args)
                        String mainArgName = "args"; // 默认
                        if (!paramStrs.isEmpty()) {
                            // 从参数列表中提取变量名（例如 "String args"）
                            String[] parts = paramStrs.get(0).split(" ");
                            if (parts.length >= 2) {
                                mainArgName = parts[parts.length - 1];
                            }
                        }
                        out.printf("public static void main(String[] %s)", mainArgName);
                        // 注册 args 为 String[] 类型（这里简单处理，因为后面不会再用到类型）
                        varProc.setVariableType(mainArgName, "String[]");
                    }else{
                        //正常方法
                        out.println(modifiers + returnType + " " + methodName + "(" + params + ") ");
                    }
                }



                // indent++;
                // super其实不用特殊处理，直接当成普通方法调用生成即可，因为PHP里super不是关键字
                // 处理构造器调用 baseCtorCall（仅限于构造方法）
                if (stmt.baseCtorCall() != null && isConstructor) {
                    String superArgs = JhpUtils.generateArgumentsString(stmt.baseCtorCall().arguments(), exprProc, indent);
                    JhpUtils.printIndent(out, indent);
                    out.println("super(" + superArgs + ");");
                }

                // 如果是静态方法，设置静态上下文标志
                boolean isStaticMethod = modifiers.contains("static ");
                if (isStaticMethod) {
                    exprProc.setStaticContext(true);
                }



                int savedIndent = visitor.getIndentLevel();
                visitor.setIndentLevel(this.indent);
                visitor.visit(body.blockStatement());
                visitor.setIndentLevel(savedIndent);

                // 还原静态上下文标志
                if (isStaticMethod) {
                    exprProc.setStaticContext(false);
                }

                // indent--;
                // JhpUtils.printIndent(out, indent);

            }
        }
        if (!isConstructor) {
            varProc.setFunctionReturnType( methodName, returnType);
        }
    }

}
