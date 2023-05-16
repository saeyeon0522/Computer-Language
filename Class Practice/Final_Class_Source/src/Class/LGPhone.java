package Class;

import Interface.Phone;

class LGPhone implements Phone {

    public void sendCall() {
        System.out.println("My call");
    }

    public void receiveCall() {
        System.out.println("Give me call");
    }

    @Override // Override Default method
    public void printLogo() {
        System.out.println("LG phone");
    }

    public void watch() {
        System.out.println("Stop selling");
    }
}
