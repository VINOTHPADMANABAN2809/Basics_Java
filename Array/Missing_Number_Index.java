package Array;
import java.util.*;
public class Missing_Number_Index {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1] - arr[i] != 1){
                System.out.println(i + 1);
                break;
            }
        }
        sc.close();
    }
}
