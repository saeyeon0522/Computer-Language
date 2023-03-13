import java.util.ArrayList;
public class Ex07 {

    public static void main(String[] args) {

        System.out.println();

        byte b = 127;
        int i = 100;

        Object res = b + i;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = 10 / 4;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = 10.0 / 4;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = (char) 0x12340041;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = (byte) (b + i);
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = (int) 2.9 + 1.8;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = (int) (2.9 + 1.8);
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();


        res = (int) 2.9 + (int) 1.8;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());

    }
}
