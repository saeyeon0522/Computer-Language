public class Wrapper {
    public static void main(String[] args) {
        Integer ten1 = Integer.valueOf(10); // boxing : int -> Integer
        int n1 = ten1.intValue(); // unboxing : Integer -> int
        System.out.println(n1);

        Integer ten2 = 10; // auto boxing (Integer.valueOf(10))
        int n2 = ten2; // auto unboxing (ten2.intValue())
        System.out.println(n2);

        // String <-> Primitive
        int i = Integer.parseInt("123");
        boolean b = Boolean.parseBoolean("true");
        double d = Double.parseDouble("3.14");

        System.out.println(i);
        System.out.println(b);
        System.out.println(d);


        String s1 = Integer.toString(123);
        String s2 = Integer.toHexString(123);
        String s3 = Double.toString(3.14);
        String s4 = Character.toString('c');
        String s5 = Boolean.toString(true);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
