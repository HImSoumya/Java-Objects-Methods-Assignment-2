// 20. Write a Java program to create a method named countVowels(String str) with return type int that takes a string as input and returns the number of vowels in it, then call the method, store the result, and display it.
import java.util.*;
public class VowelCounts {
    static int countVowels(String s){
        String vowels = "aeiou";
        int count = 0;

        for(int i = 0;i<s.length();i++){
            String ch = String.valueOf(s.charAt(i));
            if(vowels.contains(ch)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to count it's vowels: ");
        String str = sc.nextLine();

        int res = VowelCounts.countVowels(str);

        System.out.println("Vowels count in the given String is: "+res);
        sc.close();
    }
    
}