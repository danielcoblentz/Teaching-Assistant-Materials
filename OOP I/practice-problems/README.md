# Practice Questions – CS 201: Object-Oriented Programming I

These questions are optional and intended to reinforce your understanding of Java programming concepts. They align with topics covered in class and may help with homework, exam prep, and interviews.



##  Tips for Practice

- **Break down problems** before coding. Try writing pseudocode first.
- **Time yourself:** If stuck for more than 20–30 minutes, look up hints or solutions.
- **Try variations:** Modify input or output requirements to deepen understanding.



## Concept-Based Questions

### Data Types

**Q1:**  
Write a Java program that declares variables of the following types: `int`, `double`, `char`, `boolean`, and `String`. Initialize each variable and print their values.

**Q2:**  
Explain the difference between primitive data types and reference data types in Java. Provide one example of each.

---

### Loops & Conditional Statements

**Q3:**  
Write a Java program using an `if-else` statement that checks whether a number is positive, negative, or zero.

**Q4:**  
Write a Java program that uses a `for` loop to print all even numbers between 1 and 20.

---

### Methods

**Q5:**  
Create a method named `max` that takes two integers and returns the larger one. Write a `main` method to test it.

**Q6:**  
What is the difference between a **static method** and an **instance method** in Java? Provide one example of each.

---

### Arrays

**Q7:**  
Write a Java program that:
- Creates an array of 10 integers.
- Initializes the array (either hard-coded or with a loop).
- Calculates and prints the sum of all elements.

**Q8:**  
Write a method `findMax` that takes an `int[]` and returns the largest element.

---

### Inheritance

**Q9:**  
Create a base class `Animal` with a method `makeSound()` that prints a generic sound.  
Then, create a subclass `Dog` that overrides `makeSound()` to print `"Woof!"`.  
Demonstrate both in a `main` method.

---

### File I/O

**Q10:**  
Write a Java program that reads the contents of a text file and prints it to the console.  
Make sure to handle exceptions using `try-catch`.

**Q11:**  
Write a Java program that writes a list of strings to a file, placing each string on a new line.

---

### Recursion

**Q12:**  
Write a recursive method to compute the **factorial** of a given number.

**Q13:**  
Write a recursive method to compute the **nth Fibonacci number**.



##  Multiple Choice Questions (MCQs)

**1. What is the primary purpose of a class in Java?**  
A) To store data values only  
B) To define a blueprint for objects  
C) To create static methods only  
D) To manage memory allocation  


**2. Which of the following is a primitive data type in Java?**  
A) String  
B) Array  
C) int  
D) Object  


**3. Which keyword is used to create an instance of a class in Java?**  
A) new  
B) class  
C) instance  
D) create  


**4. What will be the output of this code?**  
```java
int x = 5;
if(x > 3) {
   System.out.println("A");
} else {
   System.out.println("B");
}
