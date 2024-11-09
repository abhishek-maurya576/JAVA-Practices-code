
public class MethodOverriding extends Xyz{
    
    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.add(5,6);
        obj.sum();
        obj.xyz();
        
    }
    @Override
    public int add(int a, int b){
        int sum = a+b;
        System.out.println("The sum is: "+sum);
        return sum;
    }
    public void sum(){
        System.out.println("this is override method call");
    }
    public void xyz(){
        System.out.println("This is xyz method");
    }
}
class Xyz{
    int add(int a, int b){
        return a+b;
    }
    void sum(){
        System.out.println("The sum ");
    }
}