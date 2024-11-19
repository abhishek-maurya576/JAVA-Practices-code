public class ThrowExample {
    public static void main(String[] args) {
        int age = 20;
        if(age < 18){
            try{
                throw new Exception("Age must be atleast 18");
            }catch(Exception x){
               System.out.println("Exception caught "+x.getMessage());
            }
        }else{
            System.out.println("You are eligible for voting");
        }
    }
    
}
 