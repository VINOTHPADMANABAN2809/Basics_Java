package Array;
import java.util.*;
public class GreaterLower {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        int max_ind = n-1;
        int min_ind = 0;
        while(min_ind < max_ind){
            result.add(arr[max_ind]);
            result.add(arr[min_ind]);
            max_ind--;
            min_ind++;
        }
        System.out.println(result);
        sc.close();
    }
}
