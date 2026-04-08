// 2.Write a Java program to create a method named findSum(int a, int b) with return type void that takes two numbers as parameters and prints their sum, then call the method from main().
public class FindSum {
    static void findSum(int a, int b) {
        System.out.println("Sum of a + b = " + (a + b));
    }

    public static void main(String[] args) {
        FindSum.findSum(120, 160);
    }
}