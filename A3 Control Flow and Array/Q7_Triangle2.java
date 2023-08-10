import java.util.Scanner;

public class Q7_Triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        if (num < 3 || num > 10) {
            System.out.println("Wrong input");
            return;
        }

        for (int i = num; 0 < i; i--) {
            if (i == num || i <= 2)
                for (int j = i; 0 < j; j--) System.out.print("*");
            else {
                System.out.print("*");
                for (int j = i - 2; 0 < j; j--) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
