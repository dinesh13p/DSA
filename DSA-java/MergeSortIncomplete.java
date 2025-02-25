// This only works when the half elements are already sorted in the array

public class MergeSortIncomplete {

    static void sort(int[] a, int start, int mid, int end) {
        int k = 0;
        int size = end - start;
        int i = start;
        int j = mid;
        int[] temp = new int[size];
        while (i < mid && j < end) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i < mid) {
            temp[k++] = a[i++];
        }
        while (j < end) {
            temp[k++] = a[j++];
        }
        for (i = start; i < end; i++) {
            a[i] = temp[i];
        }
        for (i = 0; i < end; i++) {
            System.out.print("   " + a[i]);
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 6, 8, 32, 1, 3, 7, 20 };
        int start = 0;
        int mid = a.length / 2;
        int end = a.length;
        sort(a, start, mid, end);

        // for (int i = 0; i < end; i++) {
        //     System.out.print("   " + a[i]);
        // }
    }
}