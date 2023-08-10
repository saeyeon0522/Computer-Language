#### [Question 1.]()
Convert the following if-else statement to switch-case statement.

```java
public static void main(String[] args) {

    int i = 0;
    
    if (i == 1)
        System.out.println("!");
    else if (i == 2)
        System.out.println("@");
    else if (i == 3)
        System.out.println("#");
    else
        System.out.println("*");

}
```

<br>

***

<br>

#### [Question 2.]()
Write a program that takes 2digit positive integer (10~99) from the user, 
and then checks if ten’s digit number and one’s digit number are same or not.

<br>

***

<br>

#### [Question 3.]() 
Write a simple calculator program. 
The available arithmetic operators are +, -, *, and / operators. 
Operands and operator must be separated by whitespaces. 
The program must print “Cannot divide by 0” string when a user tries to “divide by 0” operation. 
Use a switch-case statement.

<br>

***

<br>

#### [Question 4.]()
Write a program that prints out the following 2d array : 
* int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}}; 
* use switch-case statement for printing the row number (i.e., 1st, 2nd, … 5th)!

<br>

***

<br>

#### [Question 5.]()
Write a simple program that takes a decimal system number and print the octal system number. 
Assume that a user will type 0~1000 as input number. 
You cannot use Integer class’s method to solve this question.

<br>

***

<br>

#### [Question 6.]()
#### [Question 7.]()
Write a program to print out the following triangle pattern.
The program should take the height of a triangle from the user.
User’s input will be 3~10. Hardcoded program is not accepted.

<br>

***

<br>

#### [Question 8.]()
Write a program that 
1) takes a positive integer number N (less than 100) from the user, 
2) creates an integer array with the size of N, 
3) fills in this array using a set of random numbers ranging from 1~100, 
4) prints out the numbers in this array. 
However, this array CANNOT have the duplicated numbers.
* Hint: find the usage of Math.random() method

<br>

***

<br>

#### [Question 9.]()
Write a program that takes a single string from the user.
Then, your program needs to convert uppercase letters included in that string into lowercase letters and vice versa. 
The result should be identical to the following examples. However, you cannot use String/Character class’s toupper()/tolower()-related methods. 

* Hint: Find the usage of String’s charAt() method to take the n-th character of the string
* Hint: what is the Unicode number of ‘A’ and ‘a’?
