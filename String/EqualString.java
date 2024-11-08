public class EqualString {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = "HELLO";
        String str1 = new String("Hello");
        System.out.println(str1.equals(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));
        
    }
}
