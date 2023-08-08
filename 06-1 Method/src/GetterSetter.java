class Sample {
    public int publicNum;
    private int privateNum;
    int defaultNum;

    public int getPrivateNum() {
        return privateNum;
    }
    public void setPrivateNum(int privateNum) {
        this.privateNum = privateNum;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.publicNum = 100;
        sample.setPrivateNum(1);
        System.out.println("Private num : " + sample.getPrivateNum());
        sample.defaultNum= 10;
    }
}
