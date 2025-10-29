package Array;
import java.util.*;
public class Missing_Number {
    public static void main(String[] vk){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        System.out.println(total-sum);
       sc.close();
    }
}
