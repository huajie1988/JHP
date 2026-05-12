package compiler;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class BuiltinConfig {
    private static final Set<String> runtimeFunctions = new HashSet<>();
    private static final Map<String, String> returnTypes = new HashMap<>();

    static {
        loadConfig("resources/builtin_functions.properties");
    }

    private static void loadConfig(String resourcePath) {
        Properties props = new Properties();
        try (InputStream is = BuiltinConfig.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (is == null) {
                System.err.println("Warning: " + resourcePath + " not found, using empty lists");
                return;
            }
            props.load(is);
            for (String name : props.stringPropertyNames()) {
                runtimeFunctions.add(name);
                String type = props.getProperty(name, "Object").trim();
                returnTypes.put(name, type);
            }
        } catch (IOException e) {
            System.err.println("Failed to load builtin config: " + e.getMessage());
        }
    }

    public static boolean isRuntimeFunction(String name) {
        return runtimeFunctions.contains(name);
    }

    public static String getReturnType(String name) {
        return returnTypes.getOrDefault(name, "Object");
    }
}
