package Assignments;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of times to flip the coin: ");
        int flips = sc.nextInt();
        if (flips <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int heads = 0, tails = 0;
        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5)
                tails++;
            else
                heads++;
        }
        System.out.println("Heads Percentage: " + (heads * 100.0 / flips) + "%");
        System.out.println("Tails Percentage: " + (tails * 100.0 / flips) + "%");
    }
}
//Question 1
//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//        heads
//c. O/P -> Percentage of Head vs Tails