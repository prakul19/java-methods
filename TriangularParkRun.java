import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter of triangle
        double perimeter = side1 + side2 + side3;

        // Calculate number of rounds 
        double rounds = calculateRounds(perimeter);

        // Display result
        System.out.printf("The athlete needs to complete %.2f rounds to complete a 5 km run.\n", rounds);
    }

    // Method to calculate the number of rounds
    public static double calculateRounds(double perimeter) {
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }
}

