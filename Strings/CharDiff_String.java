package Strings;
import java.util.*;
public class CharDiff_String {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        sb.append(s.charAt(0));
        int st = 0;
        int end = 1;
        while(end < len){
            int a = s.charAt(st);
            int b = s.charAt(end);
            int diff = b-a;
            sb.append(diff);
            sb.append(s.charAt(end));
            st++;
            end++;

        }
        System.out.println(sb.toString());
        sc.close();
    }
}
