import java.util.*;
class Vowel_char_Identification{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        if(ch.length() == 1) {
            if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("O") || ch.equals("u")) System.out.println("The given character is Vowel");
            else System.out.println("The given character is Consonant");
        }
        else System.out.println("Enter only one character as string");
        sc.close();
    }
}