class Stack<E> { // T stands for Type
    private E e;
    // Provides way to handle various types using generalized type parameters
    public void set(E e) {this.e = e;}
    public E get() {return e;}
    void push(E e) {}
    E pop() {return e;}
}

public class GenericStack {
    public static void main(String[] args) {
        // set String for generic type E
        Stack<String> s = new Stack<> ();
        // can skip type parameters in <> (compiler can determine after java7)
        s.set("hello");
        System.out.println(s.get());

        // set Integer for generic type E
        Stack<Integer> i = new Stack<> ();
        i.set(5);
        System.out.println(i.get());
    }

}