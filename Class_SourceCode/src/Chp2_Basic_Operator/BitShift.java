package Chp2_Basic_Operator;

public class BitShift {

    /*

    Bit shift Operators

    1) AND(&)  :  return True if both == 1
    2) OR (|)  :  return True of 1 of == 1
    3) NOT (~) :  invert bit pattern
    4) XOR (^) :  return True if different


    Operators for Shifting bits of operands

    1) Arithmetic Left shift ( << )
        : Most-Significant bit is lost & 0 bit inserted on other end

    2) Arithmetic Right shift ( >> )
        : Least-Significant bit is lost & Most-significant bit is copied

    3) Logical Right shift ( >>> )
        : Least-Significant bit is lost & 0 bit inserted on other end

    */

    public static void main(String[] args) {

        byte a = 5;
        byte b = (byte) (a << 2); // 20
        System.out.printf("a : %d << 2 = b : %d", a, b);



        a = 20;
        b = (byte) (a >> 2); // 5
        System.out.printf("a : %d >> 2 = b : %d", a, b);



        a = 20;
        b = (byte) (a >>> 2); // 5
        System.out.printf("a : %d >>> 2 = b : %d", a, b);



        a = (byte) 0xf8; // -8
        b = (byte) (a >> 2); // -2
        System.out.printf("a : %d >> 2 = b : %d", a, b);



        short c = (short)0b0101010111111111;
        short d = (short)0x00ff;

        System.out.printf("%04x\n", (short)(c & d)); // bitwise AND
        System.out.printf("%04x\n", (short)(c | d)); // bitwise OR
        System.out.printf("%04x\n", (short)(c ^ d)); // bitwise XOR
        System.out.printf("%04x\n", (short)(~c)); // bitwise NOT



        int i = 20;
        int j = -8;

        System.out.println(i << 2);
        System.out.println(i >> 2); // arithmetic right shift
        System.out.println(j >> 2); // arithmetic right shift
        System.out.println(j >>> 2); // logical right shift

    }
}
