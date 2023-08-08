public class Car {
    String company = "Seoultech";
    String model;
    String color;
    int maxSpeed = 150;

    public Car() { // Constructor : necessary
        model = "ITM";
    }
    // Overloading : different num / type of arguments
    public Car(String company, String color) {
        this.company = company;
        this.color = color;
    }
    public double getSpeedByMile() {
        return maxSpeed * 0.62137;
    }
    public void showInfo() {
        if (maxSpeed < 100) return;
        System.out.println(company + "'s " + model + " : " + maxSpeed);
    }

    public static void main(String[] args) {
        Car mine = new Car();
        System.out.println("My car is " + mine.color + " " + mine.model);
        mine.color = "silver";
        System.out.println("My car is " + mine.color + " " + mine.model);

        Car yours = new Car("Ewha", "black");
        double speed = yours.getSpeedByMile();
        System.out.println("Your car is " + yours.color + " car of " + yours.company);
        System.out.println("Speed : " + speed);
        yours.showInfo();

    }

}
