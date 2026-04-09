// 19.Write a Java program to create a method named findLargest(int arr[]) with return type int that takes an array as parameter and returns the largest element in the array, then store the result and display it.
public class LargestELE {
    static int findLargestEle(int[] arr){
        int largetsEle = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > largetsEle){
                largetsEle = arr[i];
            }
        }
        return  largetsEle;
    }

    public static void main(String[] args) {
        int[] nums = {10,20,100,500,30,40};
        int res = LargestELE.findLargestEle(nums);

        System.out.println("Largest Element from the nums array is: "+res);
    }
}