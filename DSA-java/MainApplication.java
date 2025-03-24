class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

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

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) { // If only one element exists
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) { // Traverse until the second last node
            temp = temp.next;
        }
        temp.next = null;
    }


    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("No elements in Linked List");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class MainApplication {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtLast(3);
        linkedList.insertAtLast(4);
        
        System.out.println("List after insertions:");
        linkedList.print();

        linkedList.insertAtFirst(0);
        System.out.println("List after inserting at first:");
        linkedList.print();

        linkedList.deleteAtFirst();
        System.out.println("List after deleting first element:");
        linkedList.print();

        linkedList.deleteAtLast();
        System.out.println("List after deleting last element:");
        linkedList.print();
    }
}
