abstract class Shape {
    public Shape() {}
    public void paint() {draw();}
    abstract public void draw();
    // all abstracted methods must be implemented
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public String tostring() {return "Circle";}
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}