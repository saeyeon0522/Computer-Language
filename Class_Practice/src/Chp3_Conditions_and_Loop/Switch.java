package Chp3_Conditions_and_Loop;
import java.util.Scanner;
public class Switch {

    /*

    Switch-Case Statement  : Evaluates if given Expression matches each Case value

        1) only Char, Int, Str literals are allowed
            = X Floating-point literal

        2) Matched -> execute code block of it
            * Then Break (X Break -> Go to Default)

        3) Nothing Matched -> execute code block of Default section

    */

    public static void SwitchInt(){

        Scanner scanner = new Scanner(System.in);

        char grade;
        System.out.print("Input score (0 ~ 100) : ");
        int score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Your grade : " + grade);

    }

    public static void SwitchChar() {

        char c = '+';

        switch (c) {
            case '+':
                System.out.println('+');
                break;
            case '-':
                System.out.println('-');
                break;
            default:
                System.out.println("Nothing");
        }
    }

    public static void SwitchStr() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word : ");
        String str = scanner.next();

        switch (str) {
            case "Yes":
                System.out.println("Yes");
                break;
            case "No":
                System.out.println("No");
                break;
            default:
                System.out.println("???");
        }
    }

    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" SwitchInt \"\"\"\"\"");
        SwitchInt();
        System.out.println();

        System.out.println("\"\"\"\"\" SwitchChar \"\"\"\"\"");
        SwitchChar();
        System.out.println();

        System.out.println("\"\"\"\"\" SwitchStr \"\"\"\"\"");
        SwitchStr();
        System.out.println();
    }
}
