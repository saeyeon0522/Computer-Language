class Researcher extends Person {
    public Researcher(String name) {
        super(name);
    }
}
public class InstanceOf {
    static void print(Person person) {
        if (person instanceof Person) System.out.println("Person");
        if (person instanceof Student) System.out.println("Student");
        if (person instanceof Researcher) System.out.println("Researcher");
    }
}
