public class ThisKeywordExample {
    int num1, num2;
    int add(int a, int b){
        this.num1 = a;
        this.num2 = b;
        return this.num1+this.num2;
    }
    public static void main(String[] args) {
        ThisKeywordExample obj = new ThisKeywordExample();
        System.out.println(obj.add(5,6));
    }
    
}
