package Question3.Q1_SimpleCalculator;

class AbsCalculator extends Calculator {

    public AbsCalculator(String name) {
        super(name);
    }

    @Override
    public void printLogo() {
        System.out.println("*ITM*");
    }
    @Override
    public int add(int num1, int num2) {
        return Math.abs(num1) + Math.abs(num2) ;
        }
    @Override
    public int subtract(int num1, int num2) {
        return Math.abs(num1) - Math.abs(num2);
        }
    @Override
    public double average(int[] nums) {
        double sum = 0;
        for (int i : nums) sum += Math.abs(i);
        return sum / nums.length ;
    }
}
