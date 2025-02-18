import java.util.Scanner;
public class A1_PrintingNnaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENter a number N: ");
        int N = scanner.nextInt();

        // for(int i=N; i>0; i--){
           for(int i = 1; i <= N; i++){
        System.out.println(i);}

        scanner.close();
    }
    
}
