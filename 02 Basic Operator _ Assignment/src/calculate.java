public class calculate {

    public static void main(String[] args) {

        System.out.println();

        Object res = 67 + 12.8;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();

        res = 'c' + 1;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();

        res = 10 / 3;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();

        res = 10.0 / 3;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();

        res = 10 == 9;
        System.out.println(res);
        System.out.println(res.getClass().getTypeName());
        System.out.println();

    }
}
