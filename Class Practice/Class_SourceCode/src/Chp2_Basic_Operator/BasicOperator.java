package Chp2_Basic_Operator;

public class BasicOperator {
    public static void main(String[] args) {

        // 1 of Operands for + Operation = Str

        System.out.println("20" + 23); // 2023
        System.out.println(20 + 3); // 23
        System.out.println("Java " + 11.0); // Java 11.0

    }

    /*
        Unary Increment / Decrement
            1) Prefix : In/Decrease -> Return (++a, --a)
            2) Postfix : Return -> In/Decrease (a++, a--)


        Precedence
            1. () : Top
            2. Postfix (a++)            * R -> L
            3. Unary (++a,+a,~,!)       * R -> L
            4. Multiplicative (*,/,%)
            5. Additive (+,-)
            6. Shift (<<, >>, >>>)
            7. Relational (<, <=, instanceof, ...)
            8. bitwise AND(&) -> XOR(^) -> OR(|)
            9. logical AND(&&) -> OR(||)
            10. Ternary (?,:)
            11. Assignment (=, +=, ^=, <<=, ...)        * R -> L

            * Associativity : rule for operators with Equal precedence
                1) All binary operators (except assignment) : evaluated from Left -> Right
                2) Assignment Operator : evaluated Right -> Left

         */

}
