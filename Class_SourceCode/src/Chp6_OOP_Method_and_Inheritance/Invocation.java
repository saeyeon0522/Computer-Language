package Chp6_OOP_Method_and_Inheritance;

public class Invocation {


    class A {
        public A () {
            System.out.println("A");
        }
        public A (int x) {
            System.out.println("parameter A");
        }
    }

    /*

    Implicit invocation  :  X specify which one to invoke
        => Java compiler automatically inserts call to No-Argument Constructor

        * Constructor >=1 & X Default Constructor -> X Automatically produced = Compile error

    */

    class B extends A {
        public B () {
            System.out.println("B");
        }
        public B (int x) {
            System.out.println("parameter B");
        }
    }

    /*

    Explicit invocation : Specific super-constructor using super() method call
        * must be in 1st line of Sub-constructor

    */

    class C extends A {
        public C () {
            System.out.println("C");
        }
        public C (int x) {
            super(x);
            System.out.println("parameter C");
        }
    }

    public class Constructor {
        public void main(String[] args) {
            B b = new B(5);
            C c = new C(5);
        }
    }
}
