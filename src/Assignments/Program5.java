//5. Factors
//        a. Desc -> Computes the prime factorization of N using brute force.
//        b. I/P -> Number to find the prime factors
//        c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
//        d. O/P -> Print the prime factors of number N.

package Assignments;
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its prime factors: ");
        int N = sc.nextInt();
        System.out.println("Prime factors of " + N + " are:");
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }
        if (N > 1) System.out.print(N);
    }
}
