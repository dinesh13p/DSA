public class MergeSort {

    static void sort(int[] a, int start, int mid, int end) {
        // int size = end - start;
        int i = start;
        int j = mid;
        int[] temp = new int[end - start];
        int k = 0;
        while (i < mid && j < end) {
            if (a[i] < a[j]) 
                temp[k++] = a[i++];
             else 
                temp[k++] = a[j++];
        }
        while (i < mid) {
            temp[k++] = a[j++];
        }
        while (j < end) {
            temp[k++] = a[i++];
        }
        k = 0;
        for (i = start; i < end;) {
            a[i++] = temp[k++];
        }

        
    }

    public static void main(String[] args) {
        int a[] = { 3, 1, 6, 40, 4, 5, 10, 20};
        // int start = 0;

        int size = a.length;
        System.out.println("Array before sorting: ");
        for (int i = 0; i < size; i++){
            System.out.print("   "+a[i]);
        }
        // int mid = a.length / 2;
        // int end = a.length;
        sort(a, 4, 6, 8);

        System.out.println("\nArray after sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print("   " + a[i]);
        }

    }
    
}
