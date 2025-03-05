import java.util.Scanner;

public class YoungestTallestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create arrays
        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // take user inputs
        System.out.println("Enter the ages and heights of Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // display the results
        System.out.println("Youngest friend: " + names[findYoungest(ages)]);
        System.out.println("Tallest friend: " + names[findTallest(heights)]);
    }

    // Method to find the youngest friend
    public static int findYoungest(int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return minAgeIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(int[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return maxHeightIndex;
    }
}

