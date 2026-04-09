// 22. Write a Java program to create a method named sumNaturalNumbers(int n) with return type int that returns the sum of first n natural numbers, then call the method, store the result, and display it.
import java.util.*;
public class SumOfNaturalNo {
    static int sumNaturalNumbers(int n) {
        int sum = 0; 

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Calling the method and storing the result
        int result = sumNaturalNumbers(n);

        // Displaying the output
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        
        sc.close();
    }
}