package Question3.Q1_SimpleCalculator;

abstract class Device {
    private String vendor;

    public Device(String name) {

        this.vendor = name;
    }
    public String getVendor() {

        return vendor;
    }
    abstract void printLogo();
    public void turnOn() {
        System.out.println(vendor + " is on now...");
    }
}
