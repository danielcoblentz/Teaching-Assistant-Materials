// Linked List: Insert and Delete from the Beginning

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;

    // Insert at the beginning
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete the first node
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        System.out.println("After insertions:");
        list.printList();

        list.deleteFirst();
        System.out.println("After deleting first element:");
        list.printList();
    }
}
