import java.util.Scanner;

public class StudentVoteChecker {

    // Method 
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Cannot vote
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array to store ages 
        int[] ages = new int[10];

        // Loop to take user input 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Check if each student can vote and display the result
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
            }
        }
    }
}

