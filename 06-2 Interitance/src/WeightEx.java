class Person {
    int age;
    private int weight;
    protected int height;
    public String name;

    public void setWeight(int weight) {this.weight = weight;}
    public int getWeight() {return weight;}
}

class Student extends Person {
    public void set() {
        age = 5;
        height = 30;
        name = "cherry";
        setWeight(2);
    }
}

public class WeightEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.set();
    }
}
