package Chp6_OOP_Method_and_Inheritance;

public class StaticMember {

    /*

    Instance Member : Fields & Methods of Object / Instance
                    -> belong to object / instance
                           => Instance Members X be used without Object Instantiation
                    1) Object Creation -> Object Instantiation -> Can be used
                    2) X Sharable (reside in each object)

    Static Member = Class Member  :  belong to Class
                                    -> can be used without Object Instantiation
                    1) Class Loaded -> can be used
                    2) Sharable
                    3) Global variable / method

                    * Restriction
                    1) Instance members X be used in Static Context
                    2) this keyword X used in Static Context
    */
    int gas;
    int speed;

    static double pi = 3.141592;
    static int plus(int x, int y){
        return (x + y);
    }

    StaticMember() {}
    public static void main(String[] args) {

        StaticMember staticMember = new StaticMember();
        staticMember.gas = 1;
        staticMember.speed = 100;

        plus((int) pi, 100);
    }
}
