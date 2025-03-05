import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter an number : ");
        int number = sc.nextInt(); 

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));

        int[] digitsArray = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digitsArray));

        System.out.println("Is Duck Number: " + isDuckNumber(digitsArray));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digitsArray, number));

        int[] largestElements = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest element: " + largestElements[0]);
        System.out.println("Second largest element: " + largestElements[1]);

        int[] smallestElements = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest element: " + smallestElements[0]);
        System.out.println("Second smallest element: " + smallestElements[1]);
    }

    // Method to find the count of digits in the number
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int originalNumber) {
        int sum = 0;
        int numDigits = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }
}

