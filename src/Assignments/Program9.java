//9. Java Program to Check Whether an Alphabet is Vowel or Consonant
package Assignments;
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a Vowel.");
        }
        else {
            System.out.println(ch + " is a Consonant.");
        }
    }
}

