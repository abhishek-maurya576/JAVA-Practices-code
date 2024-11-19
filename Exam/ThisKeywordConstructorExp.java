public class ThisKeywordConstructorExp {
    ThisKeywordConstructorExp(){
        System.out.println("This is default constructure");
    }
    ThisKeywordConstructorExp(int x){
        this();
        System.out.println(x);
    }
    public static void main(String[] args) {
        ThisKeywordConstructorExp obj = new ThisKeywordConstructorExp(10);
         
    }
}
