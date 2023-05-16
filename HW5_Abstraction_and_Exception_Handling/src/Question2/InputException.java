package Question2;
import java.util.Scanner;
public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three integer numbers!");
        int sum = 0, n = 0, count = 0;

        while (count < 3) {
            try {
                System.out.print(count + ">>");
                n = scanner.nextInt();
                sum += n;
                count++;
            } catch (Exception notInt) {
                System.out.println("Not an integer number. Please input again!");
                scanner.nextLine();
            }
        }

        System.out.println("Sum is " + sum);
        scanner.close();
        }
    }
