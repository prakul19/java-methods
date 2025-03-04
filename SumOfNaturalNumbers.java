import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input from the user
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();

        // Find the sum of n natural numbers
        int sum = findSum(n);

        // Display the result
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }

    // Method 
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

