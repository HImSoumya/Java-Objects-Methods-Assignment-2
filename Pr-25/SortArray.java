// 25. Write a Java program to create a method named sortArray(int arr[]) with return type void that takes an array as parameter, sorts it in ascending order, and then displays the sorted array.

import java.util.Arrays;

public class SortArray {
    static void sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numbers = { 45, 12, 89, 7, 34 };

        System.out.println("Original Array: " + Arrays.toString(numbers));
        SortArray.sortArray(numbers);
    }
}