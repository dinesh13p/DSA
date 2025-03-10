public class SelectionSortEasy {

    public static void main(String[] args) {
        int[] arr = { 15, 11, 9, 17, 21, 6 };
        System.out.println("Selection Sort");
        System.out.println("-----------------");
        System.out.println("Numbers before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        Sort(arr);
        System.out.println();
        System.out.println("\nNumber after sorting: ");
        Display(arr);
    }

    static void Sort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    static void Display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
