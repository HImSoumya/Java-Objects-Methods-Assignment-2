// 24. Write a Java program to create a method named findSmallest(int arr[]) with return type int that takes an array as parameter and returns the smallest number in the array, then store the result and print it.
public class FindSmallest {
    static int findSmallesttEle(int[] arr) {
        int smallestEle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestEle) {
                smallestEle = arr[i];
            }
        }
        return smallestEle;
    }

    public static void main(String[] args) {
        int[] nums = { 150, 20, 100, 500, 30, 40 };
        int res = FindSmallest.findSmallesttEle(nums);

        System.out.println("Smallest Element from the nums array is: " + res);
    }
}