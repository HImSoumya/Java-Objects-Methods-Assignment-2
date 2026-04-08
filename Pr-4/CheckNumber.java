// 4.Write a Java program to create a method named checkNumberType(int n) with return type void that takes a number and checks whether it is positive, negative, or zero, then call the method from main().

import java.util.*;

public class CheckNumber {
    static void checkNumberType(int n) {
        if (n == 0) {
            System.out.println("The entered number is Zero(0)");
        } else if (n < 0) {
            System.out.println("The entered number is Negative(-)");
        } else {
            System.out.println("The entered number is Positive(+)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int userInput = sc.nextInt();

        CheckNumber.checkNumberType(userInput);
        sc.close();
    }
}