
// 12.Write a Java program to create a method named isPalindrome(int n) with return type boolean that checks whether a number is a palindrome or not, then store the result and display the output accordingly.
import java.util.*;

public class IsPalindrom {
    static boolean isPalindrome(int n) {
        int originalNo = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (originalNo == reverse) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check palindrom or not: ");
        int userInput = sc.nextInt();

        boolean res = IsPalindrom.isPalindrome(userInput);

        if (res) {
            System.out.println("Entered number is Palindrom.");
        } else {
            System.out.println("Entered number is not a Palindrom.");
        }
        sc.close();
    }
}