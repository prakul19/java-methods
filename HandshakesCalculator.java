import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        // Calling the method
        int maxHandshakes = calculateHandshakes(n);

        // Display the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + n + " students is: " + maxHandshakes);
    }

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

