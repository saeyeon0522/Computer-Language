package Chp1_Variable_and_Types;

public class AutomaticConversion {
    public static void Promotion(){

        /*
        Promotion - Automatic Conversion  :  Smaller -> Larger

        1) Passing Smaller size type -> Larger size type

        2) Performing Arithmetic operation with int type values
            * Byte, short, char type values -> int type values

        3) Performing arithmetic Different types of values
            * Arithmetic operation is only performed with Same type Operands
        */

        Object result = 0;

        long longValue = 500000L;
        double doubleValue = longValue;
        result = doubleValue;

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println("ㄴtype:" + result.getClass().getTypeName());



        int intValue = 10;
        int anotherValue = 3;
        doubleValue = 3;
        result = intValue / doubleValue;

        System.out.println(intValue / anotherValue);
        System.out.println(intValue / doubleValue);
        System.out.println("ㄴtype : " + result.getClass().getTypeName());



        char chValue = 'A';
        intValue = chValue;
        result = intValue;

        System.out.println(intValue);
        System.out.println("ㄴtype : " + result.getClass().getTypeName());



        short x= 10;
        short y = 20;
        result = x + y;

        System.out.println(result);
        System.out.println("ㄴtype after only operation : " + result.getClass().getTypeName());

    }

    public static void main(String[] args) {

     Promotion();

    }
}
