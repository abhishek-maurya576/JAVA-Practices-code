package Array;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] x) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of an Array: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter an array element: ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        } 
        System.out.println("Array elements are via for-each loop:");
        for (int i: array){
            System.out.print(i+" ");
        }
        System.out.print("Array element are via for loop: ");
            for(int i=0;i<n;i++){
                System.out.print(array[i]+" ");
            }
        
        input.close();
    }
    
}
