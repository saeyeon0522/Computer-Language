import java.util.*;

public class Sorting {
    static void printList(Vector<String> vector) {

        Iterator<String> it = vector.iterator();

        while (it.hasNext()) {
            String s = it.next();
            String separator;
            if (it.hasNext()) separator = " -> ";
            else separator = "\n";
            System.out.println(s + separator);
        }
    }

    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("peach");
        vector.add("cherry");
        vector.add("pear");
        vector.add(0, "apple");
        vector.add(2, "melon");

        Collections.sort(vector);
        printList(vector);

        Collections.reverse(vector);
        printList(vector);

        System.out.println(Collections.max(vector));
        System.out.println(Collections.min(vector));
    }
}
