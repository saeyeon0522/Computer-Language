class Rectangle {
    int x, y, width, height;

    public int getArea() {return (width * height);}
    public boolean contains(Rectangle rectangle) {
        if (x <= rectangle.x && y <= rectangle.y)
            if (((x + width) >= (rectangle.x+rectangle.width))
                    && ((y + width) >= (rectangle.y + rectangle.width))) return true;
        return false;
    }
    public void show() {
        System.out.print("coordinate: (" + x + "," + y+ ") ");
        System.out.println("area: " + width + "x" + height);
    }
    Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
public class Q2_Rectangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,9,7);
        Rectangle s = new Rectangle(5,5,7,7);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s's area is " + s.getArea());
        if (t.contains(r)) System.out.println("t contains r");
        if (t.contains(s)) System.out.println("t contains s");
    }
}