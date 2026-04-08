
// 3.Write a Java program to create a method named checkEvenOdd(int n) with return type void that takes a number as input and checks whether it is even or odd, then call the method and display the result.
import java.util.*;

public class IsEven {
    static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The given number is Even...");
        } else {
            System.out.println("The given number is Odd...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check for Even or Odd: ");
        int userInput = sc.nextInt();

        IsEven.checkEvenOdd(userInput);
        sc.close();
    }
}