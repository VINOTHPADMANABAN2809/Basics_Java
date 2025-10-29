package Array;
import java.util.*;
public class K_Rotation {
    public static void main(String[] vk){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=k;i<a;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
       sc.close();
    }
}
