package Pattens;
import java.util.*;
public class outer_box_special {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j== n-1){
                    System.out.print("* ");
                }
                else if(i==n/2 && j==n/2) System.out.print("? ");
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    
}
