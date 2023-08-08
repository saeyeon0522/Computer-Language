class Operation {
    static double abs(double num) {
        if (num < 0)
            num *= -1;
        return num;
    }
    static double max(double n, double m) {
        if (n >= m)
            return n;
        return m;
    }
    static double min(double n, double m) {
        if (n <= m)
            return n;
        return m;
    }
}

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Operation.abs(-5));
        System.out.println(Operation.max(10, 8));
        System.out.println(Operation.min(-3, -8));
    }
}
