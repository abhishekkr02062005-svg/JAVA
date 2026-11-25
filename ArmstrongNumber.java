import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            int original = number;
            int digits = String.valueOf(number).length();
            int sum = 0;

            do {
                int digit = number % 10;
                sum += (int) Math.pow(digit, digits);
                number /= 10;
            } while (number > 0);

            System.out.println(sum == original
                    ? original + " is an Armstrong number."
                    : original + " is not an Armstrong number.");
        }
        sc.close();
    }
}
