import java.util.Scanner;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter a numrator: ");
            int num = input.nextInt();
            System.out.print("Enter a denominator: ");
            int deno = input.nextInt();
            int res = num/deno;
            System.out.println("Resule: "+res);
         }
        //catch(ArithmeticException x){
        //     System.out.println("Can't Divide by zero");
        // }
        catch(Exception x){
            System.out.println("An unexpected Error occured "+x.getMessage());
        }finally{
            System.out.println("Finally block execution for cleanup");
        }
        input.close();
    }
}
