package Array;
import java.util.Scanner;

public class ArrayInpuOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = input.nextInt();
        int [] arr = new int[n] ;
        System.out.println("Enter elements of an array: ");
        for(int i=0; i<n; i++){
            arr[i] = input.nextInt(); 
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        input.close();
    }
}
