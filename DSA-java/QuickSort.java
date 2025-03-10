class QuickSort {

    // function for swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition function using the first element as the pivot
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the first element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++; // Move right if element is smaller than pivot
            while (i <= j && arr[j] > pivot) j--; // Move left if element is greater than pivot
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j); 
        return j;
    }

    // function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        System.out.println("Unsorted array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}