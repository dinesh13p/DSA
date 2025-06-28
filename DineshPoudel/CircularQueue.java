public class CircularQueue {
    int[] queue;
    int front, rear, size;

    CircularQueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = rear = -1;
    }

    void enqueue(int item) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = item;
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
        return item;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        } while (i != (rear + 1) % size);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
