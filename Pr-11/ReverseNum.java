// 11.Write a Java program to create a method named reverseNumber(int n) with return type int that returns the reverse of a given number, then store the returned result and print it.
import java.util.*;
public class ReverseNum {
    static int reverseNumber(int n) {
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse it: ");
        int userInput = sc.nextInt();

        int res = ReverseNum.reverseNumber(userInput);

        System.out.println("Entered number after reversing: "+res);
        sc.close();
    }
}