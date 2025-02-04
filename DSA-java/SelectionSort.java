public class SelectionSort {

    public static void main (String[] args) {

        int [] numbers = { 15,11,33,11,45,23,35,35,15,43};
        int size = numbers.length;
        int minIndex;
        int minValue;

        System.out.println("Numbers before sorting: \n");

        for (int i=0; i<size; i++){
            System.out.println(numbers[i]+"");
        }

        for (int i = 0; i< size-1; i++){
            minIndex = i;
            minValue = numbers[i];

            for (int j = i +1; j < size; j++){
                if (numbers[j] < minValue){
                    minIndex = j;
                    minValue = numbers[j];
                }
            }

            int temp = numbers[i];
            numbers[i] = minValue;
            numbers[minIndex] = temp;
        }

        System.out.println("After Sorting: ");
        System.out.println();
        
        for (int i = 0; i < size; i++){
            System.out.println(numbers[i]+"");
        }

    }
}
