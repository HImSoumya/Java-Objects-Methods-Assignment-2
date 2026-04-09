// 23. Write a Java program to create a method named printFibonacci(int n) with return type void that prints the Fibonacci series up to n terms, then call the method inside main().

public class PrintFib {
    static void printFibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Printing Fibonnaci Series For n = " + n);
        for (int i = 0; i < fib.length; i++) {
            System.out.println(fib[i]);
        }
    }

    public static void main(String[] args) {
        PrintFib.printFibonacci(5);
    }
}