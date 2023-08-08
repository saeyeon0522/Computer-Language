abstract class Payment {
    abstract void pay(int money);
}

class Cash extends Payment {
    @Override
    void pay(int money) {
        System.out.println("Success! " + money + "won paid.");
    }
}
class Credit extends Payment {
    @Override
    void pay(int money) {
        System.out.println("Success! Payment made with card");
    }
}
class Bitcoin extends Payment {
    @Override
    void pay(int money) {
        System.out.println("Fail! Coin destroyed.");
    }
}