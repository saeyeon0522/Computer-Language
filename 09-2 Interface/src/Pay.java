class Cash implements Payment {
    @Override
    public void pay(int money) {
        System.out.println("Success! " + money + "won paid.");
    }
}
class Credit implements Payment{
    @Override
    public void pay(int money) {
        System.out.println("Success! Payment made with card");
    }
}
class Bitcoin implements Payment{
    @Override
    public void pay(int money) {
        System.out.println("Fail! Coin destroyed");
    }
}

public class Pay {
    public static void main(String[] args) {
        Cash cash = new Cash();
        cash.pay(10000);

        Credit credit = new Credit();
        credit.pay(100000);

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.pay(1000000);
    }
}
