import java.util.Scanner;

public class Q1_WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("Exit.");
                break;
            }
            System.out.println("The number of words is " + input.split(" ").length);
        }
        scanner.close();
    }
}
