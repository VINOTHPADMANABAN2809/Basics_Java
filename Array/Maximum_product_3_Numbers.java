package Array;
import java.util.*;
public class Maximum_product_3_Numbers {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max_pos = arr[n-1] * arr[n-2] * arr[n-3];
        int max_neg = arr[0] * arr[1] * arr[2];
        int max_neg_pos = arr[0] * arr[1] * arr[n-1];
        
        int max = Math.max(max_neg, Math.max(max_pos, max_neg_pos));
        System.out.println(max);
        sc.close(); 
    }
}
