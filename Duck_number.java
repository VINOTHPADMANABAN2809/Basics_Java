import java.util.Scanner;
public class Duck_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.contains("0") && a.charAt(0) != '0') {
            System.out.println("Duck Number");
        } 
        else{
            System.out.println("Not a Duck Number");
        }
        
        sc.close();
    }
}
