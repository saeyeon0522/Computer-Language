import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;


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

public class GradeProgram {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Vector<Student> vs = new Vector<>(4);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input S" + i + "'s grade: ");
            vs.add(new Student(scn.nextInt()));
        }

        StudentComparator stucomp = new StudentComparator();
        System.out.println("Minimum grade: " + Collections.min(vs, stucomp).grade);

    }
}