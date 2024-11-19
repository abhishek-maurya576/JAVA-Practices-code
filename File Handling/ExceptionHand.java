public class ExceptionHand {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        try{
            c = a/b;
            System.out.println(c);
            System.out.println("This is Try block");
        }catch(ArithmeticException x){
            System.out.println("Exception caught"+x.getMessage());
        }finally{
            System.out.println("This is Finally block");
        }
        
        System.out.println("This is end of the program");
    
    }
}
