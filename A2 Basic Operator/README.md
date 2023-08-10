#### [Question 1.]()
Provide at least 5 examples of invalid variable names. 
Also, explain why such variable names cannot be used.
You cannot use the examples presented in the lecture slide.

<br>

***

<br>

#### [Question 2.]()
Write a program to print the following string using UNICODE literals (only for symbols). 
Capture your source code, the output of your program and paste them in this document.

<br>

***

<br>

#### [Question 3.]() 
Execute the following program. What is the output of this code? Explain why/how such a result was calculated. 

```java
public class Hello {
    public static void main(String[] args) {

        int intValue = 12345;
        System.out.println((byte) intValue);
        
    }
}
```

<br>

***

<br>

#### [Question 4.]()
How to declare a variable for the following case? Write your answer here.

- int type variable ‘height’ 	

- double type variable ‘size’ initialized to 0.25	

- double type variable ‘total’ initialized with the sum of the values of ‘height’ variable and ‘size’ variable		

- char type variable ‘c’ initialized with ‘a’		

- double type constant ‘BODYTEMP’ initialized to 36.5 	


<br>

***

<br>

#### [Question 5.]()
What is the result and type of the following statements? Explain the reason as well.

- 67+12.8
- ‘c’+1
- 10/3  
- 10.0/3
- 10 == 9 

<br>

***

<br>

#### [Question 6.]()
Execute the following codes. 
Then, you will see eight values printed on the console. 
For each value, explain how it was calculated.

```java
public class Ex {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b + i);
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);
        System.out.println((char) 0x12340041);
        System.out.println((byte) (b + i));
        System.out.println((int) 2.9 + 1.8);
        System.out.println((int) (2.9 + 1.8));
        System.out.println((int) 2.9 + (int) 1.8);

    }
}

```
