package Class;

import Interface.Phone;

class ApplePhone implements Phone {
    public void sendCall() {
        System.out.println("My call");
    }

    public void receiveCall() {
        System.out.println("Give me call");
    }

    // Additional method
    public void knock() {
        System.out.println("Knock");
    }
}
