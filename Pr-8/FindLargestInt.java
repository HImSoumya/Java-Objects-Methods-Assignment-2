// 8.Write a Java program to create a method named findLargest(int a, int b, int c) with return type int that returns the largest among three numbers, then call the method, store the result, and display it.


public class FindLargestInt {
    static int findLargest(int a, int b, int c) {
        int largestValue = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return largestValue;
    }

    public static void main(String[] args) {
        int a = 10, b = 60, c = 500;

        int res = FindLargestInt.findLargest(a, b, c);
        System.out.println("Largest Value: " + res);
    }
}