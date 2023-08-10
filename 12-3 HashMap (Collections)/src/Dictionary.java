import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        // HashMap for <String, String> pairs
        HashMap<String, String> dic = new HashMap<>();

        dic.put("saeyeon", "pink");
        dic.put("saelim", "white");
        dic.put("cherry", "gold");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Which word?");
            String name = scanner.next();
            if (name.equals("exit")) {
                System.out.println("--exit--");
                break;
            }
            String color = dic.get(name); // return corresponding color
            if (color == null) System.out.println(name + "doesn't exist");
            else System.out.println(color);
        }
        scanner.close();
    }
}
