public class ThrowExp {

    static int add(){
        int a = 10;
        int b = 0;
        int c = a / b;
        throw new ArithmeticException("Cannot divide by zero");
    }

    
    public static void main(String[] args) {
       ThrowExp.add(); 

    }
    
}
