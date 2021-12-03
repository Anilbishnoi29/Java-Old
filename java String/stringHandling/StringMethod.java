package stringHandling;

public class StringMethod {
    // string class methods 
    // length()   isEmpty()   trim()    compareTo()   
    // equal()   {upper & lower Case checked}
    // equalsIgnoreCase()   {upper & lower Case Ignored}
    // compareToIgnoreCase()
    public static void main(String[] args) {
        String sEqual1 = new String("Apple");
        String sEqual2 = new String("Apple"); // uppCase and lowerCase matter
        System.out.println("equal() ==> "+(sEqual1.equals(sEqual2)));
    }
}
