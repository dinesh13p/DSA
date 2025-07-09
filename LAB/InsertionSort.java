public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 3, 8, 1, 2, 7, 11, 17 };
        int size = numbers.length;
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println("-----------------");
        System.out.println("Original array of numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Insertion Sort
        for (int i = 1; i < size; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && temp < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }
        System.out.println();

        // Printing sorted numbers
        System.out.println("Sorted array of numbers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
