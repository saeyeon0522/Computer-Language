class Samsung implements Phone {
    // extending abstract class
    public void sendCall() {System.out.println("Ring~");}
    public void receiveCall() {System.out.println("Incoming~");}
    // additional method
    public void bixby() {System.out.println("Bixby~");}
}

class Apple implements Phone {
    public void sendCall() {System.out.println("My call");}
    public void receiveCall() {System.out.println("Your call");}
    public void siri(){System.out.println("Siri");}
    public void printLogo() { // overriding default method
        System.out.println("** IPHONE **");
    }
}

class Huawei implements Phone, Cellphone { // realization of multiple interfaces
    public void sendCall() {System.out.println("Send");}
    public void receiveCall() {System.out.println("Received");}
    public void sendSMS() {System.out.println("My Message");}
    public void receiveSMS() {System.out.println("Your Message");}
    public String touch() {return "Huawei";}
}

public class Brand {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.sendCall();
        samsung.receiveCall();
        samsung.bixby();
        samsung.printLogo();

        Apple apple = new Apple();
        apple.sendCall();
        apple.receiveCall();
        apple.siri();
        apple.printLogo();

        Huawei huawei = new Huawei();
        huawei.sendCall();
        huawei.receiveCall();
        huawei.sendSMS();
        huawei.receiveSMS();
        huawei.touch();

        // static methods of interface can be only accessed via interface name
        System.out.println(Phone.getTimeout());
    }
}
