import java.util.*;

class Student{
    int grade = 0;
    Student(int grade){
        this.grade = grade;
    }
}

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.grade, o2.grade);
    }
}

public class Q4_GradeProgram {
    public static void main(String[] args) {

        Vector<Student> vs = new Vector<>(4);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input S" + i + "'s grade: ");
            vs.add(new Student(sc.nextInt()));
        }
        StudentComparator stucomp = new StudentComparator();
        System.out.println("Minimum grade: " + Collections.min(vs, stucomp).grade);
        sc.close();
    }
}