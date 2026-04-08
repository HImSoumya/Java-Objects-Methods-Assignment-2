// 5. Write a Java program to create a method named square(int n) with return type int that returns the square of a given number, store the returned result in a variable, and then display it.

import java.util.*;
public class FindSquare {   
    static int square(int n){
        return n * n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its square: ");
        int userInput = sc.nextInt();

        int res = FindSquare.square(userInput);

        System.out.println("Square of given no. "+userInput+" is: "+res);
        sc.close();
    }
}