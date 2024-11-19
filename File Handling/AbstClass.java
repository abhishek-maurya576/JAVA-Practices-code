abstract class Test{
    abstract void methodg();
}

public class AbstClass extends Test{
    void methodg(){
        System.out.println("This is a methodg");
    }
    public static void main(String[] args) {
        AbstClass t1 = new AbstClass();
        t1.methodg();
    }    
}
