package Chp6_OOP_Method_and_Inheritance;

public class GetterSetter {

    /*

    Public Member : Public Interface exposed to External Accessors
        1) Never (Rarely) changed
        2) Deal with Private Members for Get/Setting values

    Private Member : X Exposed to External Accessors = Internal use only

     */

    public int publicNum;

    private int privateNum;
    int defaultNum;

    public int getPrivateNum() {
        return privateNum;
    }

    public void setPrivateNum(int privateNum) {
        this.privateNum = privateNum;
    }

    GetterSetter() {}

    public static void main(String[] args) {

        GetterSetter getterSetter = new GetterSetter();
        getterSetter.publicNum = 10;
        getterSetter.defaultNum = 0;
        getterSetter.setPrivateNum(20);
        System.out.println(getterSetter.getPrivateNum());
    }
}
