import java.util.*;

public class ArrayListEx {
    // Collection<E> -> List<E> -> ArrayList<E>
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input name >>");
            String name = scanner.next();
            a.add(name);
        }

        for (int i = 0; i < a.size(); i++) { // print all name in ArrayList
            String name = a.get(i);
            System.out.println(name + " ");
        }

        int longest = 0;
        for (int i = 1; i < a.size(); i++) // find longest name
            if (a.get(longest).length() < a.get(i).length()) longest = i;
        System.out.println("longest : " + a.get(longest));
        scanner.close();
    }
}
