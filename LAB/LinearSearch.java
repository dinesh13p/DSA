public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 3, 9};
        int key = 12;
        int i;
        boolean found = false;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found");
        }
    }
}
