import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop element
        System.out.println("Popped: " + stack.pop());

        // Peek element
        System.out.println("Top element: " + stack.peek());

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Print stack
        System.out.println("Stack elements: " + stack);
    }
}
