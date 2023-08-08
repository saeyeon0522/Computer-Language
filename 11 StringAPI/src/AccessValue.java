public class AccessValue {
    public static void main(String[] args) {
        String s = "saeyeon";
        char c = s.charAt(2); // return index
        System.out.println(c);

        String id = "010522-4123456";
        String first = id.substring(0, 6);
        System.out.println(first);
        String second = id.substring(7);
        System.out.println(second);
    }
}
