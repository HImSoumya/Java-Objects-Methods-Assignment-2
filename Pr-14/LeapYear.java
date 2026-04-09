
// 14. Write a Java program to create a method named isLeapYear(int year) with return type boolean that checks whether a given year is a leap year or not, then store the result and display a suitable message.
import java.util.*;

public class LeapYear {
    static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year to weather it is leap year or not: ");
        int year = sc.nextInt();

        boolean res = LeapYear.isLeapYear(year);

        if (res) {
            System.out.println("Entered year is a leap year...");
        } else {
            System.out.println("Entered year is not a leap year...");
        }
        sc.close();
    }
}