package Chp7_OOP_Casting_and_Overriding;

public class Casting {



        /*

        Upcasting (Automatic Conversion) : Sub-class -> Super-class

            * Upcasting Reference can only access Super-class members

        DownCasting : Super -> Sub (Explicitly made by Developer)

            * to use member of subclass

         */

         class Person {
            String name;
            String id;

            public Person(String name) {
                this.name = name;
            }
        }

        class Student extends Person {
            String grade;
            String department;

            public Student(String name) {
                super(name);
            }
        }


    public void main(String[] args) {
        Person person1;
        Student student1 = new Student("Saeyeon");
        person1 = student1;
        System.out.println(person1.name);
        // System.out.println(person1.grade);
        // System.out.println(person1.department);

        Person person2 = new Student("Saeyeon");
        Student student2 = (Student) person2;
        System.out.println(student2.name);
        student2.grade = "A";
        System.out.println(student2.grade);
        //person2.grade;
        //person2.department;

    }
}

