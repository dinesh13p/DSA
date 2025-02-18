public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 7};
        int size = numbers.length;

        System.out.println("Original array:");
        printArray(numbers);

        // Insertion Sort Algorithm
        for (int i = 1; i < size; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Shift elements of the sorted part of the array to the right
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("\nSorted array:");
        printArray(numbers);
    }

    // Method to print the array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
