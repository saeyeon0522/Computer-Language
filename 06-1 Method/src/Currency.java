import java.util.Scanner;

class CurrencyConverter {
    static double fixedRate;
    static void setRate(double rate) {
        fixedRate = rate;
    }
    static double toDollar(int dollar) {
        return dollar * fixedRate;
    }
    static double toWon(int won) {
        return won / fixedRate;
    }
}

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exchange rate : $1 >> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("1M Won = $" + CurrencyConverter.toDollar(1000000));
        System.out.println("$100 = " + CurrencyConverter.toWon(100) + "Won");
        scanner.close();
    }
}
