package Array;
import java.util.*;
public class Sum_elements {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }   
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum of the Array Elements: "+sum);
        sc.close();
    }
}
