import java.util.*;

public class Array_split_sort {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int mid = n/2;
       
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<mid;i++){
            ls.add(arr[i]);
        }
        Collections.sort(ls,Collections.reverseOrder());
        for(int i=0;i<mid;i++){
            arr[i] = ls.get(i);
        }
         Arrays.sort(arr,mid,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }    
}
