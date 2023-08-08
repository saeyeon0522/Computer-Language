public interface Phone { // variables are not allowed
    static final int TIMEOUT = 10000;
    // all fields are declared as public static final
    abstract void sendCall();
    abstract void receiveCall();

    default void printLogo() { // default method must exists
        System.out.println("** Phone **" + getPhoneID());
    }
    // private methods can be accessed inside same interface
    private int getPhoneID() {return (int) Math.random() * 10;}

    static int getTimeout() {return TIMEOUT;}
}

interface Cellphone extends Phone { // can extend another interface
    void sendSMS();
    void receiveSMS();
}
interface Tablet {
    void playMovie();
    void draw();
}
interface SmartWatch extends Cellphone, Tablet { // can extend multiple interfaces
    void alarm();
    void exercise();
}