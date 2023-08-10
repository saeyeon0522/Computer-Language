package Question3.Q1_SimpleCalculator;

class NormalCalculator extends Calculator {
    public NormalCalculator(String name) {
        super(name);
    }

    @Override
    public void printLogo() {
        System.out.println("I!T!M!");
    }
    @Override
    public int add(int num1, int num2) {
        return num1 + num2 ;
    }
    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public double average(int[] nums) {
        double sum = 0;
        for (int i : nums) sum += i;
        return sum / nums.length;
        }
}
