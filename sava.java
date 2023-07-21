import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head, tail;
    
    public CircularLinkedList() {
        head = null;
        tail = null;
    }
    
    public void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void printReverse() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node current = tail;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != tail);
        }
    }
}

public class sava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insert(data);
        }
        System.out.print("Reverse order: ");
        list.printReverse();
    }
}

		