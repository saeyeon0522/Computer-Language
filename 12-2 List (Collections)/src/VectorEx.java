import java.util.Vector;

public class VectorEx {
    // Collection<E> -> List<E> -> Vector<E> -> Stack<E>
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(22);
        v.add(-429);
        v.add(2, 414); // add as 2nd num

        System.out.println("num : " + v.size());
        System.out.println("current capacity : " + v.capacity());

        int sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            int m = v.elementAt(i);
            System.out.println(n);
            sum += m;
        }
        System.out.println("sum of all nums in vector : " + sum);
    }
}
