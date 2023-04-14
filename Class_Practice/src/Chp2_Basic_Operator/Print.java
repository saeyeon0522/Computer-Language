package Chp2_Basic_Operator;

public class Print {

    public static void Methods() {

        System.out.println("New Line after contents");
        System.out.print("Without new line");
        System.out.println();
        System.out.printf("Formatting String : %s", "s,d,f...");
    }

    public static void FormattingString() {
        /*

        %[argument_index$][flags][width][.precision]conversion   => %conversion : mandatory

        argument_index$ : position of argument

        flags : controls Modification of output
            1) - : Left-justified
            2) + : includes sign = whether P || N
            3) 0 : Zero Padding
            4) , : Grouping for 1000
            5) ( : show Negative sign in parentheses
            6) # : Prefix 0x || O for hex || oct

        width : min num of characters to be written

        precision : digits after Radix point

        conversion : how argument should be formatted
            1) d : Decimal int
            2) f, g : Floating-point num
            3) b : Boolean
            4) s : Str
            5) c : Unicode Char
            6) o : Unsigned Octal int
            7) x || X : Unsigned Hex int
            8) n : Platform-specific line separator

        */

        System.out.printf("%1$d %3$d %2$d\n", 10, 20, 30);
        System.out.printf("%1$d %3$f %2$s\n", 10, "Hi", 20.5);
        System.out.printf("%1$+5d %3$.2f %2$s\n", 10, "Hi", 20.5);

    }
    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" Methods \"\"\"\"\"");
        Methods();
        System.out.println("\"\"\"\"\" Formatting String \"\"\"\"\"");
        FormattingString();
    }
}
