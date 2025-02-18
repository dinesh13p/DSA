public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {15, 11, 33, 11, 45, 23, 35, 35, 15, 43};
        int size = numbers.length;

        System.out.println("Numbers before sorting:");
        printArray(numbers);

        // Selection Sort Algorithm
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element
            for (int j = i + 1; j < size; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("\nAfter Sorting:");
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
