import java.util.*;
class Positive_Negative_Zero{
    public static void main(String[] vk){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0) System.out.println("The element is Zero");
        if(n<0) System.out.println("The element is Negative");
        if(n>0) System.out.println("The element is Positive");
        sc.close();
    }
}

// This is the basic validation checking of the integer that it is positive , negative , zero
