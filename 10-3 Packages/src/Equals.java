class Rect {
    private int width, height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public boolean equals(Object object) {
        Rect rect = (Rect) object;
        if (width * height == rect.width * rect.height) return true;
        return false;
    }
}

public class Equals {
    public static void main(String[] args) {
        Rect rect1 = new Rect(2, 3);
        Rect rect2 = new Rect(3, 2);
        Rect rect3 = new Rect(4, 5);

        if (rect1.equals(rect2)) System.out.println("rect1 == rect2");
        if (rect1.equals(rect3)) System.out.println("rect1 == rect3");
        if (rect2.equals(rect3)) System.out.println("rect2 == rect3");
    }
}
