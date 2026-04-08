
// 10. Write a Java program to create a method named factorial(int n) with return type int that calculates and returns the factorial of a number, then call the method, store the result, and display it.
import java.util.*;

public class FIndFactorial {
    static int factorial(int n) {
        int fact = 1;
        for (int i = fact; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find it's Factorial: ");
        int userInput = sc.nextInt();

        int res = FIndFactorial.factorial(userInput);

        System.out.println("Factorial of " + userInput + " is: " + res);
        sc.close();
    }
}