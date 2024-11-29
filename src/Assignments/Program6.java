//6. Java Program to Compute Quotient and Remainder

package Assignments;
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        System.out.println("Quotient: " + (dividend / divisor));
        System.out.println("Remainder: " + (dividend % divisor));
    }
}
