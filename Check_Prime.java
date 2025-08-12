import java.util.*;
public class Check_Prime {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 1 || n == 1) {
            System.out.println("Prime");
        } 
        else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
