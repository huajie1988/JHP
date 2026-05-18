package runtime;

import java.util.*;

public class JhpRuntime {
    // 模拟 PHP 的 echo 功能
    public static void echo(Object... args) {
        for (int i = 0; i < args.length; i++) {
            if (i > 0) System.out.print(" ");  // 参数间加空格
            System.out.print(args[i]);
        }
    }

    public static Object arrayGet(Object array, Object key) {
        if (array instanceof List) return ((List<?>) array).get(((Number) key).intValue());
        if (array instanceof Map)  return ((Map<?,?>) array).get(key);
        throw new RuntimeException("Unsupported array type: " + array.getClass());
    }
    
    /**
     * 通用多维数组/Map赋值
     * 用法：arraySet(arr, index1, index2, ..., value)
     *       最后一个参数总是要赋的值
     */
    public static void arraySet(Object array, Object... indicesAndValue) {
        if (indicesAndValue.length == 0)
            throw new RuntimeException("arraySet needs at least one index and a value");
        Object value = indicesAndValue[indicesAndValue.length - 1];
        Object[] indices = Arrays.copyOf(indicesAndValue, indicesAndValue.length - 1);

        if (indices.length == 0)
            throw new RuntimeException("No index provided for arraySet");

        // 处理多维中间对象
        Object current = array;
        for (int i = 0; i < indices.length - 1; i++) {
            if (current instanceof List) {
                current = ((List<?>) current).get(((Number) indices[i]).intValue());
            } else if (current instanceof Map) {
                current = ((Map<?,?>) current).get(indices[i]);
            } else {
                throw new RuntimeException("Cannot index into " + current.getClass());
            }
        }

        Object lastIndex = indices[indices.length - 1];
        if (current instanceof List) {
            ((List<Object>) current).set(((Number) lastIndex).intValue(), value);
        } else if (current instanceof Map) {
            ((Map<Object, Object>) current).put(lastIndex, value);
        } else {
            throw new RuntimeException("Cannot set indexed value for " + current.getClass());
        }
    }

    public static void echo() {
        // 无参数时输出空
    }

    public static void print_r(Object obj) {
        System.out.println(obj);
    }

    public static Long strlen(String str) {
        return (long) str.length();
    }

    public static String substr(String str, int start, int length) {
        return str.substring(start, start + length);
    }

    public static String substr(String str, int start) {
        return str.substring(start);
    }

    public static String strtolower(String str) {
        return str.toLowerCase();
    }

    public static String strtoupper(String str) {
        return str.toUpperCase();
    }

    public static String trim(String str) {
        return str.trim();
    }

    public static String ltrim(String str) {
        return str.replaceAll("^\\s+", "");
    }

    public static String rtrim(String str) {
        return str.replaceAll("\\s+$", "");
    }

    public static String implode(String glue, List<String> pieces) {
        return String.join(glue, pieces);
    }

    public static List<String> explode(String delimiter, String str) {
        return Arrays.asList(str.split(delimiter));
    }

    public static String join(String glue, List<String> pieces) {
        return String.join(glue, pieces);
    }

    public static String joinArray(String glue, String[] pieces) {
        return String.join(glue, pieces);
    }

    public static String[] splitArray(String delimiter, String str) {
        return str.split(delimiter);
    }

    public static String[] splitArray(String delimiter, String str, int limit) {
        return str.split(delimiter, limit);
    }

    public static List<String> split(String delimiter, String str, int limit) {
        return Arrays.asList(str.split(delimiter, limit));
    }

    public static List<String> split(String delimiter, String str) {
        return Arrays.asList(str.split(delimiter));
    }

    public static Long count(Object obj) {
        if (obj instanceof List) return (long) ((List<?>) obj).size();
        if (obj instanceof Map)  return (long) ((Map<?,?>) obj).size();
        throw new RuntimeException("Unsupported type for count: " + obj.getClass());
    }

    public static String sprintf(String format, Object... args) {
        return String.format(format, args);
    }

}