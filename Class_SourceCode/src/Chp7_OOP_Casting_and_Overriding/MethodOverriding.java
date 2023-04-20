package Chp7_OOP_Casting_and_Overriding;

public class MethodOverriding {

    class Shape {
        public void draw() {
            System.out.println("Shape");
        }
    }

    class Line extends Shape {
        public void draw() { // method overriding!
            System.out.println("Line");
        }
    }

    class Rect extends Shape {
        public void draw() {// method overriding!
            System.out.println("Rect");
        }
    }

    class Circle extends Shape {
        public void draw() {// method overriding!
            System.out.println("Circle");
        }
    }


    static void paint(Shape p) {
        p.draw(); // call overridden draw()
    }


    public void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }

}
