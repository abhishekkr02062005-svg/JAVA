import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] arr = new int[n];
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int largest = arr[0];
            for (int value : arr) {
                if (value > largest) largest = value;
            }
            System.out.println("Largest element = " + largest);
        }
        sc.close();
    }
}
