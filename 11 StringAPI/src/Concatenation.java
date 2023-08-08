public class Concatenation {
    public static void main(String[] args) {
        // 1) using + operator
        System.out.println("abcd" + true + "EFG");
        System.out.println("I like ".concat("Java"));

        // 2) using concat
        String str = "But I also like ";
        System.out.println(str.concat("Kotlin"));
        str = str.concat("Cpp"); // new string object returned
        System.out.println(str);
    }
}
