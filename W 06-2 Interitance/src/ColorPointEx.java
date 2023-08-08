class Point {
    private int x, y;
    int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("("+ x + ", " + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {this.color = color;}
    public ColorPoint(int x, int y, int z, String color) {
        super(x, y, z);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println("color : " + color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point point = new Point(5, 6, 7);
        point.set(1, 2);
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint(1, 2, 3, "white");
        colorPoint.set(3, 4);
        colorPoint.setColor("pink");
        colorPoint.showColorPoint();
    }
}
