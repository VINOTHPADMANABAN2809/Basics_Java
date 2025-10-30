package Array;
import java.util.*;
public class Unique_Xor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int unique = 0;
        for(int i=0;i<n;i++){
            unique ^= arr[i];
        }
        System.out.println("unique element is: " + unique);
        sc.close();
    }
}
