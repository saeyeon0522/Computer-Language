import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Operation >>");
        int num1 = sc.nextInt();
        String operator = sc.next();
        int num2 = sc.nextInt();


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
            }
                break;
            default :
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
