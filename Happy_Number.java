import java.util.*;
public class Happy_Number {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        while(true){
            int sum = 0;
            while(n>0){
                int rem = n%10;
                sum += rem*rem;
                n = n/10;
            }
            if(sum == 1){
                System.out.println("Happy Number");
                break;
            }
            else if(set.contains(sum)){
                System.out.println("Not a Happy Number");
                break;
            }
            else{
                set.add(sum);
                n = sum;
            }
        }
        sc.close();

    }
}
