import java.util.*;

public class Leap_Year {
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0){
        System.out.println("Leap Year");
        }
        else{
        System.out.println("Not a Leap Year");
        }
        sc.close();
    }    
}

// This program is for identifying the leap year by the input from the user.