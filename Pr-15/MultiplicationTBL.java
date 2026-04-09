
// 15.Write a Java program to create a method named printTable(int n) with return type void that displays the multiplication table of a given number, then call the method from main().
import java.util.*;

public class MultiplicationTBL {
    static void printTable(int n) {
        System.out.println("Multiplication Table Of: " + n);
        System.out.println("-------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
            System.out.println("-------------------------------");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print it's multiplication table: ");
        int n = sc.nextInt();

        MultiplicationTBL.printTable(n);
        sc.close();
    }
}