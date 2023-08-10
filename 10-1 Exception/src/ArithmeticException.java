import java.util.Scanner;

public class ArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input dividend");
        int dividend = scanner.nextInt();
        System.out.println("Input divisor");
        int divisor = scanner.nextInt();
        // Exception occurs when divisor == 0
        System.out.println(dividend + "divided by " + divisor + "is " + dividend / divisor);
        scanner.close();
    }
}
