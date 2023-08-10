class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {return "Point(" + x + ", " + "y" + ")";}

    public boolean equals(Object object) {
        Point point = (Point) object;
        if (x == point.x && y == point.y) return true;
        return false;
    }
}

public class ObjectProperty { // root class of java
    public static void print(Object object) {
        System.out.println(object.getClass().getName());
        System.out.println(object.hashCode());
        System.out.println(object.toString()); // string representation
        System.out.println(object); // object itself
    }
    public static void main(String[] args) {
        Point point = new Point(5, 2);
        System.out.println(point.toString());
        print(point);

        Point saeyeon = new Point(5, 2);
        Point cherry = new Point(4, 1);
        if (point == saeyeon) System.out.println("point == saeyeon");
        if (point == cherry) System.out.println("point == cherry");
        if (saeyeon.equals(cherry)) System.out.println("saeyeon is equal to cherry");

    }
}
