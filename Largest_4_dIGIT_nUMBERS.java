import java.util.*;
public class Largest_4_dIGIT_numbers {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        if(n1 > n2 && n1 > n3 && n1 > n4) System.out.println("The Greatest number is " + n1);
        else if(n2 > n1 && n2 > n3 && n2 > n4) System.out.println("The Greatest number is " + n2);
        else if(n3 > n1 && n3 > n2 && n3 > n4) System.out.println("The Greatest number is " + n3);
        else System.out.println("The Greatest number is " + n4);
        sc.close();
    }
}
