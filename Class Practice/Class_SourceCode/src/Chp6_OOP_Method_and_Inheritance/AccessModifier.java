package Chp6_OOP_Method_and_Inheritance;

public class AccessModifier {

    /*

    Access Modifier : to determine whether other classes can use Particular Field
                / Invoke Particular Method in class

        1) Related with Encapsulation
        2) Hide Sensitive data & Expose Publicly Available Interfaces

        * Public (Everyone) -> Protected (All Classes in Same Package & Child class even in other package)

            -> Default (Classes in Same Package) -> Private (X)


        Top-level Modifiers : who can Use this class

             1) Public : all classes
             2) Default(package-private) : only class in Same Package
                        = X be accessed by class in another package

        Member-level Modifiers : who can Access Fields & Methods of class

             => Public, Private, Protected, Default (package-private)

        * Default can be included in own java file || java file of other class

        * Public Must have own java file

    */

    public static void main(String[] args) {

    }
}
