public class Comparison {
    public static void main(String[] args) {
        String java = "Java", cpp = "Cpp";
        int result = java.compareTo(cpp);
        // java is main
        if (result == 0) System.out.println("Same");
        else if (result < 0) System.out.println(java + " < " + cpp);
        else System.out.println(java + " > " + cpp);
    }
}
