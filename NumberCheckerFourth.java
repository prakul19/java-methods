import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerFourth {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("enter an number : ");
        int number = sc.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        int[] reversedArray = reverseArray(digitsArray);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedArray));

        System.out.println("Arrays equal: " + compareArrays(digitsArray, reversedArray));

        System.out.println("Is Palindrome: " + isPalindrome(digitsArray));

        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}

