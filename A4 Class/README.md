#### [Question 1.]()
Implement Grade class to make the following program work. Grade class’s main method is as follows :

``` java
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
```

<br>

***

<br>

#### [Question 2.]()
Implement Rectangle class to provide the following features:
-	**Member fields** : x, y, width, height (int type)
-	**Constructor(…)** : initializes x, y, width, and height fields using the given arguments
-	**getArea()** : returns the area of the rectangle
-	**show()** : prints the coordinate and the area of the rectangle
-	**contains(Rectangle rect)** : returns true if the current object contains the given Rectangle object rect  


<br>

***

<br>

#### [Question 3.]()
Write a program that works as follows. 
Your program must have Phone class (private name, private tel fields and their getters, 
and a constructor method which takes two input parameters should be implemented), and PhoneBook class. 
PhoneBook class must take the number of people to store from the user and creates Phone array. 
Information of a single person is stored in a single Phone instance. 
If a user types "stop", the program ends. 