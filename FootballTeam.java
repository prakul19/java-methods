import java.util.Random;

public class FootballTeam {

    public static void main(String[] args) {
        int[] heights = generateRandomHeights(11);

        // Display the generated heights
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    // Method to generate an random array
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generate height between 150 and 250 cm
        }

        return heights;
    }

    // Method to find the sum of all elements in the array
    public static int findSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public static int findShortest(int[] array) {
        int shortest = array[0];
        for (int value : array) {
            if (value < shortest) {
                shortest = value;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] array) {
        int tallest = array[0];
        for (int value : array) {
            if (value > tallest) {
                tallest = value;
            }
        }
        return tallest;
    }
}

