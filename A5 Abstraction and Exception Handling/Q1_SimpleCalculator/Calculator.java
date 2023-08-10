package Question3.Q1_SimpleCalculator;

abstract class Calculator extends Device implements Bootable, Refundable {
    public Calculator(String name) {
        super(name);
    }

    @Override
    public void boot() {
        System.out.println("<<< Question1.Calculator Bootup >>>");
    }
    @Override
    public void refund() {
        System.out.println(getVendor() + " Refunded!");
    }

    public abstract int add(int num1, int num2);
    public abstract int subtract(int num1, int num2);
    public abstract double average(int[] nums);

}
