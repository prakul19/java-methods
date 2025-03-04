import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Find factors of the number 
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the sum of the factors
        int sum = findSum(factors);
        System.out.println("Sum of factors: " + sum);

        // Find the product of the factors
        long product = findProduct(factors);
        System.out.println("Product of factors: " + product);

        // Find the sum of squares of the factors
        int sumOfSquares = findSumOfSquares(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

    // Method to find the factors of the number 
    public static int[] findFactors(int number) {
        int count = 0;

        // Loop to find the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array 
        int[] factors = new int[count];
        int index = 0;

        // Loop to save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors 
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product 
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares 
    public static int findSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
}

