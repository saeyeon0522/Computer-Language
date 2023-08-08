public class Circle {

    // Field : member variable to store values
    public int radius;
    public String name;

    // Method : Function
    public Circle() {
    }
    public Circle(String color) {
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius = 20;
        pizza.name = "domino";
        double area = pizza.getArea();

        Circle donut = new Circle("pink");
        donut.radius = 10;
        donut.name = "dunkin";
        area = donut.getArea();
    }
}
