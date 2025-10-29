import java.util.*;
public class Boundary_sum {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i== n-1 || j == 0 || j == m-1 ){
                    sum += arr[i][j];
                }
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}
