public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = { 12, 43, 6, 32, 42, 1, 44, 8 };
        int len = arr.length;
        QuickSort(arr, 0, len - 1);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "   ");
        }
    }

    static void QuickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int val = Partition(arr, lb, ub);
            QuickSort(arr, lb, val - 1);
            QuickSort(arr, val + 1, ub);
        }
    }

    static int Partition(int[] arr, int lb, int ub) {
        int temp;
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (start <= end && arr[start] <= pivot) {
                start++;
            }
            while (start <= end && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }

        temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        return end;

    }

}