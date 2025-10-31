package Array;
import java.util.*;
public class Zero_append {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0) ls.add(arr[i]);
            else if(arr[i] == 0){
                ls.add(0);
                ls.add(0);
            } 
            else continue;
        }
        for(int i=0;i<n;i++){
            System.out.print(ls.get(i)+" ");
        }
        sc.close();
    }
}
