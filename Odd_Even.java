import java.util.*;
public class Odd_Even {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0) System.out.println("The given number is Even");
        else System.out.println("The given number is Odd");
        sc.close();
    }
}

//This is the basic program for the check whether the number is odd or even.
