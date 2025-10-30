package Strings;
import java.util.*;
public class Vowel_Consonants_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int v = 0;
        int co = 0;
        for(char c: s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                v++;
            } else {
                co++;
            }
        }
        System.out.println("Vowels: "+ v);
        System.out.println("Consonants: "+ co);
        sc.close();
    }
}

