import java.util.*;
public class Palindrome {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();
        if(s.equals(rev)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
}
