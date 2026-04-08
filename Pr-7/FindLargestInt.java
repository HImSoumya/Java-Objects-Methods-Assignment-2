// 7. Write a Java program to create a method named findLargest(int a, int b) with return type int that returns the largest among two numbers, then store the returned value in a variable and print it.

public class FindLargestInt {
    static int findLargest(int a, int b) {
        int largestValue = (a > b) ? a : b;
        return largestValue;
    }

    public static void main(String[] args) {
        int a = 10, b = 60;

        int res = FindLargestInt.findLargest(a, b);
        System.out.println("Largest Value: " + res);
    }
}