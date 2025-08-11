import java.util.*;
public class Largest_Of_Three_numbers {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1 > n2 && n1 > n3) System.out.println("The greatest number is " + n1);
        if(n2 > n1 && n2 > n3) System.out.println("The greatest number is " + n2);
        if(n3 > n1 && n3 > n1) System.out.println("The greatest number is " + n3);
        sc.close();
     }
}

// This program is for identify the largest number among the three number. 
