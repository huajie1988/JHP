import runtime.JhpRuntime;
class Box<T> {
    public T value;
    public   Box( T value) 
    {
        this.value = value;
    }
    public  T getValue() 
    {
        return this.value;
    }
    public  void setValue( T value) 
    {
        this.value = value;
    }
    public <U> U transform( Function<T, U> func) 
    {
        return func.apply(this.value);
    }
}
class TypeParam {
    public static void main(String[] args)    {
        Box<String> box = new Box<String>("Hello, World!");
        Function<String, String> func = new Function<String, String>() {
            @Override
            public String apply( String str) 
                {
                    return JhpRuntime.strtoupper(str);
                }
            };
        String val = box.getValue();
        box.<String>transform(func);
        String result = Utils.<String>getFirst(someList);
    }
}
class Pair<K, V> {
    public K key;
    public V val;
    public   Pair( K key,  V val) 
    {
        this.key = key;
        this.val = val;
    }
    public  K getKey() 
    {
        return this.key;
    }
    public  V getVal() 
    {
        return this.val;
    }
}
class Utils {
    public static <T> T getFirst( List<T> list) 
    {
        return list.get(0);
    }
}
