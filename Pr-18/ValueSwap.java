// 18. Write a Java program to create a method named swapNumbers(int a, int b) with return type void that swaps two numbers and displays the values before and after swapping inside the method.
public class ValueSwap {
    static void swapNumbers(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a & b after swapping");
        System.out.println("a = "+a+" & b= "+b);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Value of a & b before swapping");
        System.out.println("a = "+a+" & b= "+b);

        ValueSwap.swapNumbers(a, b);
    }
}