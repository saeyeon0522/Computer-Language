package Chp3_Conditions_and_Loop;

import java.util.Scanner;

public class If {

    public static void IfStatement () {

        char grade;
        int score = 85;

        if(score >= 90) {
            grade = 'A';
        }
        else if(score >= 80) {
            grade = 'B';
        }
        else if(score >= 70) {
            grade = 'C';
        }
        else if(score >= 60) {
            grade = 'D';
        } else
            grade = 'F';



        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your score (0~100): ");
        score = scanner.nextInt();

        System.out.print("Input your grade (1~4): ");
        int year = scanner.nextInt();

        if (score >= 60) {
            if (year != 4)
                System.out.println("PASS!"); // if not a senior, pass
            else if (score >= 70)
                System.out.println("PASS!"); // if senior && greater than or equal to 70, pass
            else
                System.out.println("FAIL!"); // if senior && less than 70, fail
        } else
            System.out.println("FAIL!");
        scanner.close();

    }

    public static void Ternary() {

        // Condition ? opr2 : opr3    => Alternative of If-else

        int x = 5;
        int y = 3;

        char s = (x > y) ? 'T' : 'F';

    }


    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" IF \"\"\"\"\"");
        IfStatement();
        System.out.println();

        System.out.println("\"\"\"\"\" Ternary \"\"\"\"\"");
        Ternary();
        System.out.println();
    }
}
