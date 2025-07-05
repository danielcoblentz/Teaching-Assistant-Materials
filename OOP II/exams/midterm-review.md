# Midterm Review – Question Set

This review is meant to help prepare for the midterm exam.  
**Highlighted answers** are included for your reference.



## True or False

1. Statements beginning with the keyword `return` cause an exit from the method.  
   **True**

2. A class is a named description for a group of entities that have the same characteristics.  
   **True**

3. Each class that implements an interface must provide the complete definition of all methods declared in the interface.  
   **True**

4. A major reason for the popularity of object-oriented programming is that it enables programmers to reuse previously written code saved as classes.  
   **True**

5. Because an `ArrayList<E>` is an indexed collection, you can access its elements using a subscript.  
   **True**  
   _Note: `ArrayList` uses `.get(index)`, not bracket notation._

6. The `ArrayList<E>` has the limitation that the `add` and `remove` methods operate in O(n²) time.  
   **False**



## Multiple Choice

**1.** The ____ is used to write a decision with conditions that select the alternative to be executed.  
→ **a. if ... else**

**2.** ____ are program errors that occur during the execution of a program.  
→ **d. Exceptions**

**3.** If you define one or more constructors for a class, you must also explicitly define the ____, or it will be undefined for that class.  
→ **b. no-parameter constructor**

**4.** The call to ____ invokes the constructor for the current class whose parameter list matches the argument list.  
→ **c. this()**

**5.** A data field or method with ____ visibility can be accessed in the class, subclass, and classes in the same package.  
→ **b. protected**

**6.** Which of the following statements is correct?  
→ **d. In Java, a variable of a superclass type can reference an object of a subclass type.**

**7.** Which of the following is considered a visibility modifier in Java?  
→ **a. private**

**8.** Which of the following can be done with an array object?  
→ _None of the listed options are fully correct. Arrays are fixed in size and require shifting._

**9.** A(n) ____ is a data structure that contains a data item and one or more links.  
→ **b. node**

**10.** You could create a circular list from a single-linked list by executing the statement ____.  
→ **a. tail.next = head;**



## Short Answer

**1. What is the superclass of all Java classes?**  
→ **Object class**

**2. What is overriding? What is overloading?**  
→ **Overriding**: Redefining a method in a subclass that exists in a superclass (same signature).  
→ **Overloading**: Defining multiple methods with the same name but different parameters.

**3. What is a syntax error?**  
→ A compile-time error that violates the syntax rules of Java (e.g., missing semicolon).

**4. Order the following by increasing growth rate:**  
`n², n log n, n, log n, 2ⁿ, c`  
→ **c < log n < n < n log n < n² < 2ⁿ**

**5. Which Java package contains the `ArrayList<E>` class?**  
→ **java.util**



## Java Programming

### a. Second Largest Value Method (HighArray class)

```java
public long secondLargest() {
    if (nElems < 2) return -1;

    long largest = Long.MIN_VALUE;
    long secondLargest = Long.MIN_VALUE;

    for (int i = 0; i < nElems; i++) {
        if (a[i] > largest) {
            secondLargest = largest;
            largest = a[i];
        } else if (a[i] > secondLargest && a[i] != largest) {
            secondLargest = a[i];
        }
    }

    return (secondLargest == Long.MIN_VALUE) ? -1 : secondLargest;
}
```

### b. ArrayList After Execution

**Question:**  

What will the `ArrayList` contain after the following code executes?

```java
ArrayList<Integer> myList = new ArrayList<Integer>();
myList.add(5);
myList.add(4);
myList.add(3);
myList.add(1);
myList.add(3, 2);     // Inserts 2 at index 3
myList.remove(1);     // Removes the element at index 1 (value 4)
myList.set(1, 8);     // Replaces the element at index 1 (was 3) with 8
```
Answer:
`[5, 8, 2, 1]`

Notes:

- add(index, value) inserts at a position, shifting elements to the right.
- remove(index) deletes the element at the specified index and shifts remaining elements left.
- set(index, value) replaces the element at the given index — it does not insert a new one.

### c. Linked List Insert and Delete
**Question:**

Assume the following Node and LinkList classes are defined.
Fill in the insertFirst() and deleteFirst() methods to implement correct behavior.

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {
    private Node head;

    // insert at the beginning of the list
    public void insertFirst(int data) {
        // your code here
    }

    // delete the first node in the list
    public void deleteFirst() {
        // your code here
    }
}
```

**Answer:**

```java
public void insertFirst(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

public void deleteFirst() {
    if (head != null) {
        head = head.next;
    }
}


```

**Optional test code**
```java
public void displayList() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}

public static void main(String[] args) {
    LinkList list = new LinkList();

    list.insertFirst(10);
    list.insertFirst(20);
    list.insertFirst(30);

    System.out.println("Linked list after insertions:");
    list.displayList();

    list.deleteFirst();
    System.out.println("Linked list after deleting first element:");
    list.displayList();
}
```

Notes:

- insertFirst() adds a node to the front of the list by updating the head pointer.
- deleteFirst() removes the front node by updating the head to point to the next node.
- This technique is commonly used in singly linked list implementations for stack behavior.