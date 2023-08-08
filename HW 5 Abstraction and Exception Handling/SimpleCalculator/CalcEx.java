package Question1;

public class CalcEx {

    public static void main(String [] args) {

        Calculator[] calcs = {
                new NormalCalculator("Seoultech_ITM"),
                new AbsCalculator("IE_ITM")
        };

        for(Calculator myCalc : calcs) {
            myCalc.boot();
            myCalc.turnOn();
            myCalc.printLogo();

            System.out.println("Add: "+myCalc.add(2, -3));
            System.out.println("Subtract: "+myCalc.subtract(2, -3));
            System.out.println("Average: "+myCalc.average(new int[]{2, -3, 4}));

            myCalc.refund();
            myCalc.shutdown();
        }
    }
}
