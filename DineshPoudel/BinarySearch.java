public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int searchelement = 8;
        int start = 0;
        int end = a.length - 1;
        int mid = -1; // Default in case element not found
        boolean found = false;

        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == searchelement) {
                System.out.println("Element " + searchelement + " found at index " + mid);
                found = true;
                break;
            } else if (a[mid] < searchelement) {
                start = mid + 1;
            } else {
                end = mid - 1; // Fixed to match corrected C version
            }
        }

        if (!found) {
            System.out.println("Element " + searchelement + " not found");
        }
    }
}
