import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input 
        System.out.println("Enter the Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // print the results
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f\n",
                interest, principal, rate, time);
    }

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

