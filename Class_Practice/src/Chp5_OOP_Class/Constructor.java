package Chp5_OOP_Class;

public class Constructor {

    /*

    Constructor
        1) Multiple definitions allowed (at least 1)
            - Constructor Overloading : Same name, but type & num of arguments are different
        2) Name of constructor must be Identical
        3) X declare Return type
        4) can have arguments
        5) reference to class / object itself -> use this.field syntax

    Default Constructor : X defined by developers
                    -> Compiler automatically inserts Default Constructor
                        = X constructor : Impossible
        ex) public Circle () {}

    this()  :  can be used for calling another constructor in class
                -> used in 1st line of constructor
    */

    String company;
    String model;
    String color = "black";
    int maxSpeed = 150;

    Constructor(String com) {
        this(com, "GRAM", 100);
    }

    Constructor(String com, int maxSpeed) {
        this(com, "MAC", maxSpeed);
    }
    public Constructor(String com, String mod, int maxSpeed) {
        company = com;
        model = mod;
    }



    public static void main(String[] args) {
        Constructor constructor1 = new Constructor("LG");
        System.out.println(constructor1.company);
        Constructor constructor2 = new Constructor("Apple", 120);
        System.out.println(constructor2.model);
    }
}
