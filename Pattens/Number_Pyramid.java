package Pattens;
import java.util.*;
public class Number_Pyramid {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
            System.out.print(p+" ");
            p++;
            }
            System.out.println();
        }
        sc.close();
    }
}
