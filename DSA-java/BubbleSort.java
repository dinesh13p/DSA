public class BubbleSort {
        public static void main(String[] args) {
            int[] numbers = { 19, 13, 27, 34, 8, 21, 5, 10};
            int size = numbers.length;
            System.out.println();
            System.out.println("Bubble Sort");
            System.out.println("----------------");
            System.out.println("Before Sorting:");
            // for printing given index numbers
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
    
            // Bubble Sorting logic
            for (int i = 0; i < size-1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            System.out.println();
            System.out.println("\nAfter Sorting:");
    
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
    
        }
    }
    
