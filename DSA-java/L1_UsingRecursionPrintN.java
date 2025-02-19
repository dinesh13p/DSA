public class L1_UsingRecursionPrintN {
    
    // 1 2 3 4 5 6 7 8 9 10


    static void printNNaturalNumbers(int n) {

        if (n <= 0){
            return;
        }
        // System.out.println(n);
        // printNNaturalNumbers(n - 1);

        printNNaturalNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNNaturalNumbers(10);
    }
}
