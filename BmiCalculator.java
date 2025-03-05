import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D array to store data
        double[][] data = new double[10][3];
        
        // create array
        String[] status = new String[10];
        
        // take user input
        System.out.println("Enter the weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Weight of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        
        // Calculate BMI and BMI status
        for (int i = 0; i < 10; i++) {
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = determineStatus(data[i][2]);
        }
        
        // Display the results
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", data[i][1], data[i][0], data[i][2], status[i]);
        }
    }
    
    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }
    
    // Method for  BMI status
    public static String determineStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

