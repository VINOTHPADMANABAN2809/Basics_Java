import java.util.*;
class EligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int roll_no = sc.nextInt();
        int arrears = sc.nextInt();
        float cgpa = sc.nextFloat();
        System.out.println(name);
        System.out.println(roll_no);
        if(arrears == 0 && cgpa >= 7.0) System.out.println("Eligible");
        else if((arrears == 1 || arrears == 2) && (cgpa >=7.5)) System.out.println("Eligible");
        else System.out.println("Not Eligible");
        sc.close();
    }
}