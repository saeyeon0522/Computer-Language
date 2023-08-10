import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2_TokenOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        String newEquation = equation.replace(" ", "");
        StringTokenizer st = new StringTokenizer(newEquation, "+");

        int sum = 0;
        while (st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
        System.out.println("Result is " + sum);
        scanner.close();
    }
}
