package Array;
import java.util.*;
public class Check_sort {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        boolean sort = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                continue;
            }
            else{
                sort = false;
                break;
            }
        }
        if(sort) System.out.println("sorted");
        else System.out.println("Not sorted");
        sc.close();
    }
}
