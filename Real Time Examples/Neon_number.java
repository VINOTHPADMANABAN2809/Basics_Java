import java.util.*;
public class Neon_number {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq = n * n;
        int sum = 0;
        int temp = sq;
        while(temp!=0){
            sum += temp%10;
            temp /= 10;
        }
        if(n == sum){
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }   
        sc.close();
    }
}
