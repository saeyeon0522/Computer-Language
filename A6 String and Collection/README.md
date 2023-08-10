#### [Question 1.]()
Write a program that takes a string line from the user and counts the words separated by whitespaces. 
The program continues until the user types “exit”. 
Use split() method of String class.

<br>

***

<br>

#### [Question 2.]()
Write a program that takes an “add equation” from the user and prints out the result. 
Use StringTokenizer.


<br>

***

<br>

#### [Question 3.]()
Write a program using HashMap to manage customer names and point scores. 
This program manages customer points in a cumulative way. 
Once one customer data is inserted, information of all the customers so far should be printed out. 
This program continues until the user types “exit”.

<br>

***

<br>

#### [Question 4.]()
Write a program that can take student grades and then compute the minimum one. 
Our main code uses Collections.min() method to get the minimum one in the Student collection, 
however, no ideas on how to compare Student instances are given. 
Therefore, you MUST implement StudentComparator class which provides a comparison operation regarding our Student class based on the grade!
- As described in the main code, Collections.min() can take a custom comparator instance to compare the items in the given collection. In our case, we need a comparator instance to compare student items in the vector.
- StudentComparator must implement Comparator<T> interface to meet the goal.
- A class implementing Comparator<T> interface should have a method that takes two arguments and compares them for order. 
- Code in the main method and Student class cannot be modified.
- Refer to the Java API reference to study more about Comparator<T> interface (https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html).

```java
class Student{
    int grade=0;
    Student(int grade){
        this.grade = grade;
    }
}

class StuduentComparator {

    // This class must be implemented
    // Search for how Comparator<T> works! 
    
}

public class Ex04 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Vector<Student> vs = new Vector<>(4);

        for(int i=0;i<4;i++){
            System.out.print("Input S"+i+"'s grade: ");
            vs.add(new Student(scn.nextInt()));
        }

        StuduentComparator stucomp = new StuduentComparator();
        System.out.println("Minimum grade: "+Collections.min(vs,stucomp).grade);

    }

}
```