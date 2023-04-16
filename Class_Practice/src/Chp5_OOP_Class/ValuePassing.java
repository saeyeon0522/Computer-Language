package Chp5_OOP_Class;

public class ValuePassing {

    int length;
    ValuePassing() {};

    /*

    Argument Passing

    1. Primitive  :  value is Copied -> passed to Method
                  => Change of Argument X affect Original value
    2. Reference  :  Reference is Passed to Method
                  => Change of Argument affects Original value

    */

    static void increase(int n) {
        n += 1;
    }

    // Method Overloading : Methods with Same Name, but with Different Num / Type of Arguments

    static void increase(int array[]) {
        for (int i = 0; i < 3; i++)
            array[i]++;
    }

    public static void main(String[] args) {

        int n = 10;

        increase(n);
        System.out.println(n);


        ValuePassing valuePassing = new ValuePassing();
        valuePassing.length = 10;
        increase(valuePassing.length);


        int arr[] = {1, 2, 3, 4, 5};
        increase(arr);
    }
}
