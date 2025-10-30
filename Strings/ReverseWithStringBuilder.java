package Strings;

import java.util.*;

public class ReverseWithStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder lettersOnly = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                lettersOnly.append(s.charAt(i));
            }
        }
        lettersOnly.reverse();
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(lettersOnly.charAt(index));
                index++;
            } else {
                result.append(ch);
            }
        }

        System.out.println(result);
        sc.close();
    }
}


// import java.util.Scanner;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         char[] arr = input.toCharArray();
//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {
//             
//             if (!Character.isLetter(arr[left])) {
//                 left++;
//             }
//             
//             else if (!Character.isLetter(arr[right])) {
//                 right--;
//             }
//           
//             else {
//                 char temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right--;
//             }
//         }

//         System.out.println(new String(arr));
//     }
// }
