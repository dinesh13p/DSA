class CircularQueue {
    int front;
    int rear;
    int queue[];
    int size;

    CircularQueue(int queueSize) {
        this.queue = new int[queueSize];
        this.front = -1;
        this.rear = -1;
        this.size = queueSize;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {  // First element insertion
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public int deQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int data = queue[front];

        if (front == rear) { // Only one element left
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

// Driver Class
public class CircularQueueExample {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);

        System.out.println("Queue after enQueue operations:");
        queue.print();

        System.out.println("Trying to insert another element:");
        queue.enQueue(15); // This should print "Queue is Full"

        System.out.println("Dequeuing elements:");
        System.out.println("Removed: " + queue.deQueue());
        System.out.println("Removed: " + queue.deQueue());

        System.out.println("Queue after deQueue operations:");
        queue.print();

        System.out.println("Adding elements after dequeue:");
        queue.enQueue(15);
        queue.enQueue(16);
        queue.print();
    }
}
