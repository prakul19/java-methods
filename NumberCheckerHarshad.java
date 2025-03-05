import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerHarshad {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an number : ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        System.out.println("Sum of digits: " + sumOfDigits(digitsArray));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digitsArray));

        System.out.println("Is Harshad Number: " + isHarshadNumber(digitsArray, number));

        int[][] digitFrequency = findDigitFrequency(digitsArray);
        System.out.println("Digit Frequency: ");
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i][1] > 0) {
                System.out.println("Digit " + digitFrequency[i][0] + ": " + digitFrequency[i][1] + " times");
            }
        }
    }

    // Method to find the count of digits 
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number 
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        return digits;
    }

    // Method to find the sum of the digits 
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits 
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int originalNumber) {
        int sumOfDigits = sumOfDigits(digits);
        return originalNumber % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
}

