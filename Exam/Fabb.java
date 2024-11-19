import java.util.*;
public class Fabb{
    public static void main(String[] args) {
        int i,nextTerm, t1=0, t2=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("The Fabb Series is: "+t1+" "+t2+" ");
        for(i=3;i<=num;i++){
            nextTerm = t1+t2;
            System.out.print(" "+nextTerm);
            t1=t2;
            t2=nextTerm;
        }
        input.close();
    }
}