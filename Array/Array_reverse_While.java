package Array;
import java.util.*;
public class Array_reverse_While {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int i = n-1;
        while(i >= 0 && i < n){
            System.out.print(arr[i] + " ");
            i--;
        }
        sc.close();
    }
}
