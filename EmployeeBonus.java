import java.util.Random;

public class EmployeeBonus {

    public static void main(String[] args) {
        int[][] salaryAndService = determineSalaryAndService(10);
        
        int[][] newSalaryAndBonus = calculateNewSalaryAndBonus(salaryAndService);
        
        displayResults(salaryAndService, newSalaryAndBonus);
    }

    // Method to find Salary and Years of Service
    public static int[][] determineSalaryAndService(int numEmployees) {
        int[][] salaryAndService = new int[numEmployees][2];
        Random random = new Random();
        
        for (int i = 0; i < numEmployees; i++) {
            salaryAndService[i][0] = 10000 + random.nextInt(90000); // 5-digit salary
            salaryAndService[i][1] = random.nextInt(11); // Years of service between 0 and 10
        }
        
        return salaryAndService;
    }

    // Method to calculate the new salary and bonus
    public static int[][] calculateNewSalaryAndBonus(int[][] salaryAndService) {
        int[][] newSalaryAndBonus = new int[salaryAndService.length][2];
        
        for (int i = 0; i < salaryAndService.length; i++) {
            int salary = salaryAndService[i][0];
            int yearsOfService = salaryAndService[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            int bonus = (int) (salary * bonusPercentage);
            int newSalary = salary + bonus;
            
            newSalaryAndBonus[i][0] = newSalary;
            newSalaryAndBonus[i][1] = bonus;
        }
        return newSalaryAndBonus;
    }

    // Method to display the results in tabular format
    public static void displayResults(int[][] salaryAndService, int[][] newSalaryAndBonus) {
        int sumOldSalary = 0;
        int sumNewSalary = 0;
        int totalBonus = 0;

        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Old Salary", "Service", "New Salary", "Bonus", "Sum");
        
        for (int i = 0; i < salaryAndService.length; i++) {
            int oldSalary = salaryAndService[i][0];
            int service = salaryAndService[i][1];
            int newSalary = newSalaryAndBonus[i][0];
            int bonus = newSalaryAndBonus[i][1];
            
            sumOldSalary += oldSalary;
            sumNewSalary += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d %-10d %-10d %-10d%n", oldSalary, service, newSalary, bonus);
        }

        System.out.println();
        System.out.printf("Sum of Old Salary: %d%n", sumOldSalary);
        System.out.printf("Sum of New Salary: %d%n", sumNewSalary);
        System.out.printf("Total Bonus: %d%n", totalBonus);
    }
}

