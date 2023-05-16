package Interface;

public interface Phone {
    public static final int TIMEOUT = 10000;
    public abstract void sendCall();
    public abstract void receiveCall();
    public default void printLogo() {
        System.out.println("** Phone **\n Phone ID : " + getPhoneID());
    }

    private int getPhoneID() {
        return (int) (Math.random()*10);
    }

    static int getTimeout() {
        return TIMEOUT;
    }
}
