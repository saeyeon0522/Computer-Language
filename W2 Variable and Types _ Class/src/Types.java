public class Types {

    public static void Types() {

        System.out.println("\u2661"); // Heart...

        boolean myValue = true;
        System.out.println(myValue); // T

        myValue = 10 < 15;
        System.out.println(myValue); // T

        myValue = 10 ==15;
        System.out.println(myValue); // F

        String str = null; // can be used for Reference Type
        System.out.println(str);
    }

    public static void Constant() {

        /*
        final (Constant)  : Unchangeable, Read-only variable
                        -> cannot assign again
            *Naming convention  : All Uppercase & separated by underscores(_)
        */

        final Double PI_VALUE = 3.141592;
        System.out.println(PI_VALUE);

    }



    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" Type \"\"\"\"\"");
        Types();
        System.out.println();

        System.out.println("\"\"\"\"\" Constant \"\"\"\"\"");
        Constant();
        System.out.println();

    }
}
