package Chp6_OOP_Method_and_Inheritance;

public class Inheritance {

    /*

    1 class with Common features + Specialized Sub-classes without Duplicated Members

        1) Sub = Child    : Derived from Other
        2) Super = Parent : class which Sub is Derived
        3) X support Multiple Inheritance
        4) X Limitation on Num of inheritance
        5) Every class is implicitly a Subclass of Object
            * root : java.lang.Object (automatically made by Java compiler)

    * Advantage     1) Reduced Duplicated codes
                    2) Better Maintenance of classes -> Hierarchical Relationships
                    3) Improved Productivity -> Class Reuse & Extension




    */

    class Point {
        private int x, y;

        public void set(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void showPoint() {
            System.out.println(x + y);
        }
    }

    class ColorPoint extends Point {
        private String color;

        public void setColor(String color) {
            this.color = color;
        }

        public void showColorPoint() {
            System.out.println(color);
            showPoint();
        }

    }

    public void main(String[] args) {
        Point point = new Point();
        point.set(1, 2);
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        colorPoint.set(3, 4);
        colorPoint.setColor("Red");
        colorPoint.showColorPoint();
    }
}
