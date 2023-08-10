import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(522);
        v.add(424);
        v.add(-429);
        v.add(2, 17);

        // print all elements using iterator
        Iterator<Integer> it = v.iterator();
        int sum = 0;

        while (it.hasNext()) {
            System.out.println(it.next());
            sum += it.next();
        }
        System.out.println("sum : " + sum);
    }
}


