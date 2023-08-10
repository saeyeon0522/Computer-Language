class Box<K, V> {
    private K k;
    private V v;

    public void set(K k, V v) {
        this.k = k;
        this.v = v;
    }
    public K getKey() {return k;}
    public V getValue() {return v;}
}

public class GenericBox {
    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();
        box.set("hello", 5);
        System.out.println(box.getKey());
        System.out.println(box.getValue());

        Box<Double, Double> dBox = new Box<>();
        dBox.set(5.22, 4.14);
        System.out.println(dBox.getKey());
        System.out.println(dBox.getValue());
    }
}
