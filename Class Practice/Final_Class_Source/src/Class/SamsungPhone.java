package Class;

import Interface.Phone;

class SamsungPhone implements Phone {
    public void sendCall() {
        System.out.println("Ring");
    }

    public void receiveCall() {
        System.out.println("Incoming call");
    }

    // Additional method
    public void flash() {
        System.out.println("Flash");
    }
}
