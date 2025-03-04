import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the first number: ");
        int number = sc.nextInt();
        System.out.println("Enter the second number (divisor): ");
        int divisor = sc.nextInt();

        // Find remainder and quotient
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the quotient and remainder
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The remainder is: " + result[1]);
    }

    // Method 
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }
}

