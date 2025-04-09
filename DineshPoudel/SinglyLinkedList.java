class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void insertAtLast(int data) {
        Node nextNode = new Node(data);
        if (head == null) {
            head = nextNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nextNode;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty. There is nothing to delete.");
            return;
        }
        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty. There is nothing to delete.");
            return;
        }
        if (head.next == null) { // If only one node is present
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertAtNth(int data, int position) {
         Node newNode = new Node(data);

        // Insert at the beginning
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
         }

        // If position is out of bounds
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

public void deleteAtNth(int position) {
        if (head == null) {
            System.out.println("List is empty. There is nothing to delete.");
            return;
        }

        // Delete at beginning (position 0)
        if (position == 0) {
            deleteAtFirst();
            return;
        }

        // Traverse to the node before the one to delete
        Node temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Check if position is out of bounds
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        // Delete the node by skipping it
        temp.next = temp.next.next;
    }

    // Print list
    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No elements in the linked list");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.print(); // Empty list
        linkedlist.deleteAtFirst();//Nothing to delete
        linkedlist.insertAtLast(4);
        linkedlist.insertAtLast(6);
        linkedlist.insertAtLast(8);
        linkedlist.insertAtLast(9);
        System.out.println("\nAfter inserting elements at Last :");
        linkedlist.print(); 

        linkedlist.insertAtFirst(2);
        System.out.println("\nAfter inserting element at First :");
        linkedlist.print(); 

        linkedlist.insertAtNth(5,4);
        System.out.println("\nAfter inserting element at 5th Position :");
        linkedlist.print(); 

        linkedlist.deleteAtFirst();
        System.out.println("\nAfter deleting element at First :");
        linkedlist.print(); 

        linkedlist.deleteAtLast();
        System.out.println("\nAfter deleting element at Last");
        linkedlist.print();

        linkedlist.deleteAtNth(2);
        System.out.println("\nAfter deleting element at 3rd Position :");
        linkedlist.print(); 
        
        System.out.println();
        linkedlist.deleteAtNth(10);
    }
}