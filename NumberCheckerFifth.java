import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerFifth {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an number : ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));
    }

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = sumOfDigits(getDigitsArray(square));
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        int product = productOfDigits(digits);
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Helper method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Helper method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digits;
    }

    // Helper method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Helper method to find the product of the digits of a number
    public static int productOfDigits(int[] digits) {
        int product = 1;
        for (int digit : digits) {
            product *= digit;
        }
        return product;
    }
}

