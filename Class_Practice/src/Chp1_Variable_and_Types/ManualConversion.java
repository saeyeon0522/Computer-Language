package Chp1_Variable_and_Types;

public class ManualConversion {
    public static void Casting(){

        /*
        Larger type -> Smaller type  :  byte -> short -> int -> long -> float -> double

            1) Done manually by Casting operation '(type)'
            2) May result in Loss of value
         */

        short shortValue = 10;
        char chValue2 = (char) shortValue;

        System.out.println(chValue2);



        short x= 10;
        short y = 20;
        short total = (short) (x + y);

        System.out.println(total);



        double myDouble = 11.50;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);



        myInt = 67;
        char myChar = (char) myInt;

        System.out.println(myInt);
        System.out.println(myChar);

    }


    public static void main(String[] args) {

        Casting();

    }
}
