package Chp5_OOP_Class;

// Access Modifier - Class decl' - Class name
public class Structure {

    /*

     Field : member variable to store values (state)
        1) Object's Unique data
        2) Object's Current Status
        3) Sub-objects = Components

        * How to Access (= method)
        1) Inside Object : Direct by "fieldName"
        2) Outside Object : by "refVariable.fieldName"


    */
    int radius;
    String name;

    // Methods : Function in which the behavior implemented

    public Structure() {

    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Structure pizza = new Structure();
        pizza.name = "Java";
        pizza.radius = 10;
        double area = pizza.getArea();

    }
}
