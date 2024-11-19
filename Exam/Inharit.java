class Animal{
    public Animal(){
        System.out.println("This is animal constructure");
    }
    public void print(){
        System.out.println(
            "This is print"
        );
    }
    void xyz(){
        System.out.println("This is xyz method");
    }
}


class Dog extends Animal{
    int x = 5;
    public void bark(){
        System.out.println("This Dog is bark");
    }
}

public class Inharit extends Dog {
    Inharit(){
        super();
        
        super.xyz();
        super.bark();
        System.out.println(super.x);
        
    }
    public static void main(String[] args) {
        Inharit obj = new Inharit();
        obj.print();
        
    }
    
}
