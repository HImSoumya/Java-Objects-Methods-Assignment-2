
// 9. Write a Java program to create a method named isPrime(int n) with return type boolean that checks whether a given number is prime or not, store the returned result in a boolean variable, and display the appropriate message.
import java.util.*;

public class IsPrime {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter a number to check is it prime or not: ");
        int userInput = sc.nextInt();

        boolean res = IsPrime.isPrime(userInput);

        if (res) {
            System.out.println("Entered number is a prime number...");
        } else {
            System.out.println("Entered number is not a prime number...");
        }

        sc.close();
    }
}