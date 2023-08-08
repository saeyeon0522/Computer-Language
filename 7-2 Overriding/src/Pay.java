class Payment {
    void pay(int money) {System.out.println("Payment");}
}
class Cash extends Payment {
    void pay(int money) {System.out.println("Success! " + money + "won paid.");}
}
class Credit extends Payment {
    void pay(int money) {System.out.println("Success! Payment made with card.");}
}
class Bitcoin extends Payment {
    void pay(int money) {System.out.println("Fail! Coin destroyed.");}
}

public class Pay {
    static void purchase(Payment[] payments) {
        for (Payment p : payments) {p.pay(10000);}
    }

    public static void main(String[] args) {
        Payment[] mine = new Payment[3];
        mine[0] = new Cash();
        mine[1] = new Credit();
        mine[2] = new Bitcoin();
        purchase(mine);
    }
}
