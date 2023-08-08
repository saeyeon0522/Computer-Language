class Person {
    String name;
    public Person(String name) {this.name = name;}
}

class Student extends Person {
    double grade;
    int id;

    public Student(String name) {
        super(name);
    }
}

public class Casting {
    public static void main(String[] args) {
        Person person;
        Student student = new Student("Saeyeon");
        person = student; // Upcasting : can only access superclass' members
        System.out.println(person.name);
        // person.id = 21; (x)
        // person.grade = 4.5; (x)

        Student s = (Student) person; // Downcasting : explicitly made by developer
        // When wish to use subclass' members
        System.out.println(s.name);
        s.id = 21;
        s.grade = 4.5;
        // person.id = 21; (x)
        // person.grade = 4.5; (x)
    }
}
