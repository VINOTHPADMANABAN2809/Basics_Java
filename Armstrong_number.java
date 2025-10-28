import java.util.*;
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int temp = a;
        int a_len = String.valueOf(a).length();
        int sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum +=  Math.pow(r, a_len);
            temp /= 10;
        }

        if (sum == a) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}
