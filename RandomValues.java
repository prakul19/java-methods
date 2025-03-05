import java.util.Random;

public class RandomValues {

    public static void main(String[] args) {
        int[] randomValues = generate4DigitRandomArray(5);

        System.out.print("Generated 4-digit random values: ");
        for (int value : randomValues) {
            System.out.print(value + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(randomValues);

        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }

    // Method to generate random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
	    // Generate 4-digit random number	
            randomNumbers[i] = 1000 + random.nextInt(9000);
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }
}

