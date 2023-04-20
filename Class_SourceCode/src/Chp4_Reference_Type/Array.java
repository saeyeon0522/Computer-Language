package Chp4_Reference_Type;

public class Array {

    public static void Basic() {

        int[] intArray1 = {4, 3, 2, 1, 5};
        double doubleArray[] = {0.1, 0.02, 0.003};

        int[] intArray2 = new int [5];
        int intArray3[] = new int [5];

        int myArr[] = intArray2;
        System.out.println(myArr.length);

    }


    public static void ForEach() {

        // for (type variable : array)

        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int k : num)
            sum += k;
        System.out.println("sum : " + sum);



        enum Week {MON, TUE, WED, THU, FRI}
        for (Week day : Week.values())
            System.out.println(day);

    }


    public static void TwoDimensional() {

        // Declaration
        int intArr[][];
        char[][] charArr;

        // Creation
        double doubleArray[][] = new double[5][2];
        long[][] longArray = new long[3][4];

        // Declaration with Initialization
        int arr1[][] = {{1, 2, 3}, {4, 5}, {6}};
        int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7}};



        double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;

        for (int year = 0; year < score.length; year++) {
            for (int term = 0; term < score[year].length; term++)
                sum += score[year][term];
        }



        int arr[][] = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[2];

    }


    // main() : Entry point of Java App

    public static void main(String[] args) {

        System.out.println("\"\"\"\"\" For-Each \"\"\"\"\"");
        ForEach();
        System.out.println();

        System.out.println("\"\"\"\"\" 2D-Array \"\"\"\"\"");
        TwoDimensional();
        System.out.println();


        System.out.println("\"\"\"\"\" Main - ARGS \"\"\"\"\"");

        // Passing Arguments
        for (String arg : args)
            System.out.println(arg);
    }
}
