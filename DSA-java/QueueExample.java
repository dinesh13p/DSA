class Queue {
    int front;
    int rear;
    int queue[];

    Queue(int queueSize) {
        this.queue = new int[queueSize];
        this.front = 0;
        this.rear = 0;
    }

    public void enQueue(int data) {
        if (rear == queue.length) {
            System.out.println();
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public int deQueue() throws Exception {
        if (front >= rear) {
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");
        }
        int data = queue[front++];
        return data;
    }

    void print() {
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i] + "  ");
        }
    }
}

public class QueueExample {
    public static void main(String[] args) {

        
        try {
            Queue queue = new Queue(3);
        
            queue.enQueue(10);
            queue.enQueue(20);
            queue.enQueue(30);
            queue.enQueue(40); // This prints "Queue is full"
        
            queue.print();
        
            System.out.println("Dequeued: " + queue.deQueue());
            queue.print();
        
            System.out.println("Dequeued: " + queue.deQueue());
            queue.print();
        
            System.out.println("Dequeued: " + queue.deQueue());
            queue.print();
        
            System.out.println("Dequeued: " + queue.deQueue()); // This should throw an exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        


    }

}
