package Search;
import java.util.*;
public class Linear_Search {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                System.out.println("Target found at the index: "+i);
                found = true;
                break;
            }
            else continue;
        }
        if(!found) System.out.println("Target not found");
        sc.close();
    }
}
