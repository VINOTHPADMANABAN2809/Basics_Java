package Pattens;
import java.util.*;
public class Pattern_N {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==j){System.out.print("* ");}
                else{System.out.print("  ");}
            }
            System.out.println();
        } 
        sc.close();
    }
}
