// 6. Write a Java program to create a method named cube(int n) with return type int that returns the cube of a given number, store the result in a variable, and display it.
import java.util.*;

public class FindCube {
    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its cube: ");
        int userInput = sc.nextInt();

        int res = FindCube.cube(userInput);

        System.out.println("Cube of given no. " + userInput + " is: " + res);
        sc.close();
    }
}