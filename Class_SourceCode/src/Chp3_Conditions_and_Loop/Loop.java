package Chp3_Conditions_and_Loop;

public class Loop {

    /*

    for (initialization; condition; increment) {

        ... Statements ...
    }

    1) Empty condition == True -> Infinite Loop

    2) Multiple statements seperated by ',' allowed
        ex) for (int i = 0; i < 10, System.out.print(i))

    */
    public static void For() {

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }

    public static void While() {

        // While : Evaluates expression => must return Boolean

        int j = 0, i = 0;

        while (i < 10) {
            while (j < 5) {
                System.out.println("i : " + i + ", j : " + j + ", 1st");
                j++;
                if (j % 2 == 1) continue;   // pass (applied in only Current loop)
                System.out.println("i : " + i + ", j : " + j + ", 2nd");
            }
            System.out.println("i : " + i + ", j : " + j + ", 3rd");
            i++;
        }
        System.out.println("i : " + i + ", j : " + j + ", 4th");


       /*

       while(true) {
            while (true) {
                break;      * only applied on Current loop
            }
            System.out.println("Here");
        } * Infinite

        */

    }


    public static void DoWhile() {

    /*
    : Statements within do block is always executed at least 1

    Do {

        ... Statements ...

    } while (condition);

    */
        int i = 0;

        do {
            System.out.println("executed");
        } while(i < 0);
    }



    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" FOR \"\"\"\"\"");
        For();
        System.out.println();

        System.out.println("\"\"\"\"\" While \"\"\"\"\"");
        While();
        System.out.println();

        System.out.println("\"\"\"\"\" Do-While \"\"\"\"\"");
        DoWhile();
        System.out.println();
    }
}

