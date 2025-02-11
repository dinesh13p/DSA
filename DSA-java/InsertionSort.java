public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2, 7};
        int size = numbers.length;

        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Insertion Sort Algorithm
        for (int i = 1; i < size; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("");
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
