#### [Question 1.]()
Carefully read the following descriptions.

Find CalcEx.java file and add implementations to meet the following requirements :
1.  Add Bootable interface: this interface should have “public abstract void boot()” method and “default void shutdown()” method. The shutdown method must provide an implementation for printing out a shutdown message (“---Shutdown---“) to the console.
2. Add Refundable interface: this interface should have “public abstract void refund()” method.
3. Add Device abstract class: this class must have “private String vendor” field which will be set by Device(String name) constructor. Also, a getter method for this field (i.e., vendor) must be implemented here. 
Device class should have “abstract void printlLogo()” method and “public void turnOn()” which prints out “[vendor field] is on now…” to the console.
4. Add Calculator abstract class: this class extends Device class and implements Bootable and Refundable interfaces. 
The boot() method of Bootable interface must be implemented in this class. The boot() method prints out “<<< Calculator Bootup >>>” to the console. 
The refund() method of Refundable interface must be implemented in this class. The refund() method prints out “[vendor name](use getter method) + Refunded!” to the console.
Also, this class provide the following public abstract methods: int add (int num1, int num2), int subtract(int num1, int num2), double average(int[] nums) that will be implemented by NormalCalculator and AbsCalculator.
5. NormalCalculator and AbsCalculator extend Calculator class, and must implement all abstract methods defined in Calculator, Device, and Bootable/Refundable interfaces. The difference between NormalCalculator and AbsCalculator is as follows:
- Add method takes two integer numbers and then prints the result of addition
- Subtract method takes two integer numbers and then prints the result of subtraction
- Average method takes an array of integer numbers and then prints the average
- AbsCalculator does the same thing except that all the input parameters are converted to positive integer numbers (e.g,. myCalc.add(2, -3) will be treated like myCalc.add(2, 3))
- printLogo() method must be implemented by these classes. The printLogo() method of AbsCalculator and NormalCalculator prints “*ITM*" and  “!I!T!M!”, respectively.
- Constructor which takes a single String parameter must be supported. This constructor should invoke a superclass’s constructor method to set the vendor field of Device class.

<br>

***

<br>

#### [Question 2.]()
Carefully read the following code and descriptions.

``` java
import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three integer numbers!");
        int sum=0, n=0;
        for(int i = 0; i<3; i++) {
            System.out.print(i+">>");
            n = scanner.nextInt(); // Exception occurs when invalid input given
            sum += n;
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
```

- The above program is crashed when a user types invalid type input (e.g., “jinwoo”, 130.130, etc). Use try/catch clause to avoid such exception/crash and finally get the result. 
- When invalid type data given, your program must print "Not integer number. Please input again!" and keep waiting for a new input number from the user. 
- When your program takes 3 valid integer input data from the user, the result should be computed and printed out.


<br>

***

<br>

#### [Question 3.]()
Carefully read the following code and descriptions.

```java
public class EqualsEx {
    public static void main(String[] args) {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);
        if(a.equals(b)) System.out.println("a is equal to b");
        if(a.equals(c)) System.out.println("a is equal to c");
        if(b.equals(c)) System.out.println("b is equal to c");
    }
}

class Rect {
    private int width;
    private int height;
    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

```

- The above program prints out nothing because Rect instances point different addresses.
- Improve Rect class to compare the instance identity based on the area. In other words, Rect with the width of 2 and the height of 3 (here, its area is 6) should be identical to Rect with the width of 3 and the height of 2 (area of this rect is also 6!).
