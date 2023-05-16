package Ch09_Abstract_Class;

import java.util.Scanner;

abstract class Payment {
    abstract void pay(int money);
}

class Cash extends Payment {
    void pay(int money) {
        System.out.println("Success! " + money + " won paid");
    }
}

class Bitcoin extends Payment {
    void pay(int money) {
        System.out.println("Fail! Coin destroyed.");
    }
}

class Credit extends Payment {
    void pay(int money) {
        System.out.println("Success! Payment made with your card");
    }
}
public class MethodOverridingEx {
    static void purchase (Payment[] pay) {
        for (Payment s: pay) s.pay(1000);
    }
    public static void main(String[] args) {
        Payment[] myPayments = new Payment[3];
        myPayments[0] = new Cash();
        myPayments[1] = new Bitcoin();
        myPayments[2] = new Credit();

        purchase(myPayments);
    }
}

