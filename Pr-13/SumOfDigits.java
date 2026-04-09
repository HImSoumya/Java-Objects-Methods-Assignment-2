
// 13. Write a Java program to create a method named sumOfDigits(int n) with return type int that calculates and returns the sum of digits of a number, then call the method and print the result.
import java.util.*;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        String num_str = Integer.toString(n);
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum += Character.getNumericValue(num_str.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get the sum of it's digits: ");
        int userInput = sc.nextInt();

        int res = SumOfDigits.sumOfDigits(userInput);

        System.out.println("Sum of the digits: " + res);
        sc.close();
    }
}