package Chp2_Basic_Operator;

import java.util.Scanner;
public class ScannerClass {

    /*
    Scanner : Reading Key Inputs
        1) read item based on Whitespace Delimiter ('\t', '\f', '\r', '\n', '')
            = Scanner reads Token seperated by Whitespace Delimiter
        2) can read Byte Stream & convert to Various data types

     Methods : nextBoolean, nextByte(), nextShort(), nextInt(), nextDouble(), nextFloat(),
               next(), nextLine(), close(), hasNext()
        * hasNext() : Returns True if Token is given, otherwise waits for new input (Break Loop by CTRL-Z)
     */
    public static void main(String[] args) {

        System.out.println("Input your name, city, age, and weight, separated by a single whitespace");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next(); // Read String
        System.out.print("My name is " + name + ", ");

        int age = scanner.nextInt(); // Read Int value
        System.out.print("age is " + age + "-years old, ");

        double weight = scanner.nextDouble(); // Read Floating-point value
        System.out.print("Weight is " + weight + "kg, ");

        System.out.println("\nOk. Are you single?");
        boolean single = scanner.nextBoolean(); // Read Boolean value
        System.out.println(single);

        System.out.println("\nAny comment?");
        String comment = scanner.nextLine(); // Read line
        System.out.println("Your answer: " + comment);

        scanner.close(); // Close the scanner

    }
}
