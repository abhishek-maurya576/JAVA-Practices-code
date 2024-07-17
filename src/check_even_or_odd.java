import java.util.Scanner;

public class check_even_or_odd {
    public static void main(String[] args) {
        int mynum;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        mynum = scan.nextInt();
        System.out.println("You have Entered Num: " +mynum);

        if(mynum % 2 != 0) {
            System.out.println("This is an ODD number");
        }
        else{
            System.out.println("This is a EVEN number");
        }
    }
}
