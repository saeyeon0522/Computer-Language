package Ch09_Abstract_Class;

// Abstract class containing Abstract methods
abstract class Shape{
    public Shape() {}
    public void paint() {}
    abstract public void draw(); // X Implementation for abstract methods
}


// Abstract class without abstract class
abstract class MyComponent {
    String name;
    public void load(String name) {
        this.name = name;
    }
}

// Abstract class Inheriting another abstract class
abstract class Line extends Shape { // X implementing draw() method
    public String toString() {
        return "Line";
    }
}