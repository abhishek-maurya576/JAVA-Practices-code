public class Exeption{
    public static void main(String[] x){
        int a = 10, b = 0, c;
        try{
            c = a/b;
            System.out.println("This msg not executed");
        }catch(Exception m){
            System.out.println("Error "+m.getMessage());
            System.out.println("This catch block");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}