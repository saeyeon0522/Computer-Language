import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3_CustomerProgram {
    static void printInfo(Map<String, Integer> info) {
        for (Map.Entry<String, Integer> entry : info.entrySet())
            System.out.print("(" + entry.getKey() + ", "+ entry.getValue() + ")");
    }

    public static void main(String[] args) {
        System.out.println("** Point Management System **");
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> info = new HashMap<>();

        while (true) {
            System.out.print("Input your name and point>> ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Exit the program.");
                break;
            }
            String[] split = input.split(" ");
            String name = split[0];
            int point = Integer.parseInt(split[1]);
            if (info.containsKey(name)) {
                int accumulate = info.get(name);
                point += accumulate;
            }
            info.put(name, point);
            printInfo(info);
            System.out.println();
        }
        scanner.close();
    }
}

