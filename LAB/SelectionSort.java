public class SelectionSort {
    public static void main(String[] args) {
        int [] numbers = {15, 11, 33, 11, 45, 23, 35, 35, 15, 43};
        int size = numbers.length;
        System.out.println("Number Before Sorting");
        int midIndex;
        int minvalue;
        //for printing given index numbers
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }

        //for looping
        for(int i=0; i<size-1; i++){
            midIndex = i;
            minvalue = numbers[i];
            for(int j=i+1; j<size; j++){
                if(numbers[j] < minvalue){
                    midIndex = j;
                    minvalue = numbers[j];
                }
            }
            int temp = numbers[i];
            numbers[i] = minvalue;
            numbers[midIndex] = temp;
        }
    
        System.out.println();
        System.out.println("\nAfter Sorting");
        // System.out.println();
        for(int i=0; i<size; i++){
            System.out.print(numbers[i] + " ");
        }



    }
}