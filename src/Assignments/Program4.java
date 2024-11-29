
//4. Harmonic Number
//        a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
//        (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
//        b. I/P -> The Harmonic Value N. Ensure N != 0
//        c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
//        d. O/P -> Print the Nth Harmonic Value.

package Assignments;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Please enter a positive integer:");
            return;
        }
        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }
        System.out.println("The " + N + "th Harmonic Number is: " + harmonic);
    }
}
