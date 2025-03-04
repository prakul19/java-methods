import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers 
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural  number: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            System.exit(0);
        }

        // Calculate sum using recursion
        int sumRec = sumRecursion(n);
        int sumForm = sumFormula(n);

        // Compare the results and print
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);

        if (sumRec == sumForm) {
            System.out.println("The results from both methods are correct.");
        } else {
            System.out.println("There is a difference between the methods.");
        }
    }
}

