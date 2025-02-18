public class Recursion {
    /*
     * function functionName(args ) {
     * 
     * base condition
     * 
     * finctioncall() }
     * 
     */
    static int num = 10;

     static void recursion(){
        if (num <= 0){
            return;
        }
        num --;
        recursion();
        System.out.println("After Recursion" + num);
     }
    public static void main(String[] args) {
        recursion();

    }
    
}
