package Class;

import Interface.Phone;

public class Example {
    public static void main(String[] args) {

        ApplePhone myphone = new ApplePhone();
    SamsungPhone yourphone = new SamsungPhone();
    LGPhone herphone = new LGPhone();


        System.out.println("myphone");
        myphone.sendCall();
        myphone.receiveCall();
        myphone.knock();

        System.out.println("yourphone");
        yourphone.sendCall();
        yourphone.receiveCall();
        yourphone.flash();

        System.out.println("herphone");
        herphone.printLogo();
        myphone.printLogo();
        yourphone.printLogo();

        System.out.println(Phone.getTimeout());
        System.out.println(myphone.getTimeout());
    }
}
