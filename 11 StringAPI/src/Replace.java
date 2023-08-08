public class Replace {
    public static void main(String[] args) {
        String java = "Java is hard.";
        System.out.println(java.replace("hard", "good"));
        String cpp = java.replace("Java", "Cpp");
        System.out.println(cpp);
    }
}
