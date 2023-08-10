import java.util.HashMap;
import java.util.Scanner;

class Student {
    int id;
    String major;
    public Student(int id, String major) {
        this.id = id;
        this.major = major;
    }
}

public class StudentEx {
    public static void main(String[] args) {

        HashMap<String, Student> map = new HashMap<>();

        map.put("saeyeon", new Student(1, "ITM"));
        map.put("saelim", new Student(2, "Industrial Engineering"));
        map.put("cherry", new Student(3, "Playing"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("name?");
            String name = scanner.nextLine();
            if (name.equals("exit")) break;
            Student student = map.get(name);
            if (student == null) System.out.println(name + "doesn't exist");
            else System.out.println("id : " + student.id + ", major : " + student.major);
        }
        scanner.close();
    }
}
