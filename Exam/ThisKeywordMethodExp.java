class X{
    void m(){
        System.out.println("This is m method");
    }
    void n(){
        System.out.println("this is n method");
    this.m();
    }
}

public class ThisKeywordMethodExp {
    
    public static void main(String[] args) {
     X obj = new X();   
     obj.n();
    }
    
}
