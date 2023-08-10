import java.util.Vector;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {return "(" + x + ", " + y + ")";}
}

public class PointVector {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<>();

        v.add(new Point(5, 22));
        v.add(new Point(4, 29));
        v.add(new Point(4, 14));

        v.remove(1);
        for (int i = 0; i< v.size(); i++) {
            Point p = v.get(i);
            System.out.println(p);
        }

    }
}
