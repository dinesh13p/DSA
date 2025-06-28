import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);

        System.out.println("Min Heap Elements: " + minHeap);

        // Remove elements in sorted order
        while (!minHeap.isEmpty()) {
            System.out.println("Removed: " + minHeap.poll());
        }
    }
}
