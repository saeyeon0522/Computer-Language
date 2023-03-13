import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        System.out.println("Input your name, city, age, and weight, separated by a single whitespace");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // Read a string
        System.out.print("My name is " + name + ", ");
        String city = scanner.next(); // Read a string
        System.out.print("city is " + city + ", ");
        int age = scanner.nextInt(); // Read an integer value
        System.out.print("age is " + age + "-years old, ");
        double weight = scanner.nextDouble(); // Read a floating-point value
        System.out.print("Weight is " + weight + "kg, ");
        System.out.println("\nOk. Are you single?");
        boolean single = scanner.nextBoolean(); // Read a boolean value
        System.out.println(single);
        System.out.println("\nAny comment?");
        String comment = scanner.nextLine(); // Read a line
        System.out.println("Your answer: " + comment);
        scanner.close(); // Close the scanner
    }
}
