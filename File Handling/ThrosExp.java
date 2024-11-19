public class ThrosExp {
    //Dalaaal na glne wale
    public static void div(int a, int b) throws ArithmeticException {
        System.out.println(a/b);
    }


    public static void main(String[] args) {
        
        try{ 
            ThrosExp.div(10,0);
        }catch(ArithmeticException x){
            System.out.println("Arithmetic Exception Occured");
            System.out.println(x.getMessage());
        }

    }
}
