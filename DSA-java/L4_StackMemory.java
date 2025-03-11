public class L4_StackMemory {
    
    static int[] stack = new int[10];
    static int top = -1;
    static int size = stack.length;

    static public Boolean isFull() {
        if (top >= size - 1) {
            return true;
        }
        return false;
    }

    static Boolean isEmpty() {
        if (top <= size - 1) {
            return true;
        }
        return false;
    }

    static void push(int number) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = number;
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        }
        int value = stack[top];
        top--;

        return value;
    }

    static void printStack() {
        int i = top;
        while (i >= 0) {
            System.out.println(stack[i]);
            i--;
        }
        // for (i = 0; i <= top;i++) {
        // System.out.println();
        // System.out.println(stack[i] + "\t");
        // }
    }

    public static void main(String[] args) {
        printStack();
        pop();
        push(9);
        printStack();
    }
}