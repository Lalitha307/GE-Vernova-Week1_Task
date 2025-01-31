//3. Power of 2
//a. Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//        b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//        d. O/P -> Print the year is a Leap Year or not.
package Assignments;
public class Program3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (N < 0 || N >= 31) {
            System.out.println("Please enter 0 <= N < 31.");
            return;
        }
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
        }
    }
}
