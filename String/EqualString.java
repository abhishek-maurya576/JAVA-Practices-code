public class EqualString {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        String str2 = "HELLO";
        String str3 = new String("Hello");
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str3));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str==str3); //false why?
        System.out.println(str==str1);
        
    }
}
