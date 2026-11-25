import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String text = sc.nextLine();

        String cleaned = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        System.out.println(cleaned.equals(reversed)
                ? "It is a palindrome."
                : "It is not a palindrome.");
        sc.close();
    }
}
