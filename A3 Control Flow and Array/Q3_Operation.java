import java.util.Scanner;

public class Q3_Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operation >>");
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();

        switch (operator) {
            case "+" :
                System.out.println(num1 + "+" + num2 + "= " + (num1 + num2));
                break;
            case "-" :
                System.out.println(num1 + "-" + num2 + "= " + (num1 - num2));
                break;
            case "*" :
                System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
                break;
            case "/" : {
                if (num2 == 0) {
                    System.out.println("Cannot divide by 0");
                } else {
                    System.out.println(num1 + "/" + num2 + "= " + (num1 / num2));
                }
                break;
            }
            default :
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
}
