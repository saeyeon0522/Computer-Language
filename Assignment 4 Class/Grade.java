import java.util.Scanner;
public class Grade {

    int math;
    int science;
    int english;

    public int average () {
        return (math + science + english) / 3;
    }

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    };

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the score of Math, Science, and English subject >> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("Average is " + me.average());
        scanner.close();
    }
}
