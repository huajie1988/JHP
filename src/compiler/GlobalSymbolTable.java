package compiler;

import java.util.*;


public class GlobalSymbolTable {
    // 类名 -> 泛型参数列表
    private Map<String, List<String>> classTypeParams = new HashMap<>();
    // 类名 -> (方法名 -> 返回类型)
    private Map<String, Map<String, String>> methodReturnTypes = new HashMap<>();
    // 类名 -> (方法名 -> 参数类型列表)
    private Map<String, Map<String, List<String>>> methodParamTypes = new HashMap<>();
    // 类名 -> 父类
    private Map<String, String> superClasses = new HashMap<>();
    // 类名 -> 实现的接口列表
    private Map<String, List<String>> interfaces = new HashMap<>();

    public void addClass(String className, List<String> typeParams) {
        classTypeParams.put(className, typeParams);
        methodReturnTypes.putIfAbsent(className, new HashMap<>());
        methodParamTypes.putIfAbsent(className, new HashMap<>());
    }

    public void addMethod(String className, String methodName, String returnType, List<String> paramTypes) {
        Map<String, String> methods = methodReturnTypes.computeIfAbsent(className, k -> new HashMap<>());
        methods.put(methodName, returnType);
        Map<String, List<String>> params = methodParamTypes.computeIfAbsent(className, k -> new HashMap<>());
        params.put(methodName, paramTypes);
    }

    public void setSuperClass(String className, String superClass) {
        superClasses.put(className, superClass);
    }

    public void setInterfaces(String className, List<String> ifaces) {
        interfaces.put(className, ifaces);
    }

    public List<String> getClassTypeParams(String className) {
        return classTypeParams.getOrDefault(className, Collections.emptyList());
    }

    public String getMethodReturnType(String className, String methodName) {
        Map<String, String> methods = methodReturnTypes.get(className);
        return methods != null ? methods.getOrDefault(methodName, "Object") : "Object";
    }

    public List<String> getMethodParamTypes(String className, String methodName) {
        Map<String, List<String>> params = methodParamTypes.get(className);
        return params != null ? params.getOrDefault(methodName, Collections.emptyList()) : Collections.emptyList();
    }

    public void dump() {
        System.out.println("=== Global Symbol Table ===");
        for (String className : classTypeParams.keySet()) {
            System.out.println("Class: " + className);
            System.out.println("  TypeParams: " + classTypeParams.get(className));
            System.out.println("  Super: " + superClasses.getOrDefault(className, "null"));
            System.out.println("  Interfaces: " + interfaces.getOrDefault(className, Collections.emptyList()));
            Map<String, String> methods = methodReturnTypes.get(className);
            if (methods != null) {
                for (String m : methods.keySet()) {
                    System.out.println("  Method: " + m + " -> " + methods.get(m) +
                            " params=" + methodParamTypes.get(className).get(m));
                }
            }
        }
    }
}
