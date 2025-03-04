import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trigonometric functions
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Display the trigonometric functions
        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, trigValues[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, trigValues[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, trigValues[2]);
    }

    // Method 
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[] {sine, cosine, tangent};
    }
}

