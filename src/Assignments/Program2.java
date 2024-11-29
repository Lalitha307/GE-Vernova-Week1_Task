//2. Leap Year
//        a. I/P -> Year, ensure it is a 4 digit number.
//        b. Logic -> Determine if it is a Leap Year.
//        c. O/P -> Print the year is a Leap Year or not.

package Assignments;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int year = sc.nextInt();
        if (year >= 1000 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        else {
            System.out.println("Invalid year. Please enter a 4-digit year.");
        }
    }
}
