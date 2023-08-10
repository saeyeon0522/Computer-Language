import java.util.Scanner;

public class Q2_NumCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2-digit number (10~99): ");
        int num = scanner.nextInt();
        if (num < 10 || num > 99) System.out.println("Wrong input!");
        else if (num / 10 == num % 10) System.out.println("Yes! two numbers are same!");
        else System.out.println("No! two numbers are NOT same!");
        scanner.close();
    }
}
