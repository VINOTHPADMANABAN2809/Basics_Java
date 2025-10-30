package Strings;
import java.util.*;
public class Equivalent_String {
    public static void main(String[] ck){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String first_half = "ABCDEFGHIJKLM";
        String second_half = "ZYXWVUTSRQPON";
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(first_half.indexOf(ch)!=-1){
                int index = first_half.indexOf(ch);
                result.append(second_half.charAt(index));
            } else if(second_half.indexOf(ch)!=-1){
                int index = second_half.indexOf(ch);
                result.append(first_half.charAt(index));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
