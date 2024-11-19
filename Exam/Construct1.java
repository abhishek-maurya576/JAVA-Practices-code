public class Construct1 {
    int rollNo, age;
    String name;
    Construct1(int r, int a, String n){ //Here is not need to "this" keyword
        rollNo = r;
        age = a;
        name = n;
        System.out.println("Roll No: "+rollNo+" Name: "+name+" Age: "+age);
    }
    public static void main(String[] args) {
        Construct1 obj = new Construct1(1, 20, "Rahul");
    }
    
}
