package Array;
import java.util.*;
public class Right_Rotation {
    public static void main(String[] vk) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
       for(int i=1;i<a;i++){
        System.out.print(arr[i] + " ");
       }
       for(int i=0;i<1;i++){
        System.out.print(arr[i] + " ");
       }
       sc.close();
    }
}
