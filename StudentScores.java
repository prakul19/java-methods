import java.util.Random;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students input
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate scores for students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, percentage, grades, and remarks
        String[][] results = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        sc.close();
    }

    // Generate random scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics score
            scores[i][1] = 10 + random.nextInt(90); // Chemistry score
            scores[i][2] = 10 + random.nextInt(90); // Math score
        }

        return scores;
    }

    // Calculate total, average, percentage, grades, and remarks
    public static String[][] calculateResults(int[][] scores) {
        String[][] results = new String[scores.length][5];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = String.valueOf(total);
            results[i][1] = String.format("%.2f", average); // Round to 2 decimal places
            results[i][2] = String.format("%.2f", percentage); // Round to 2 decimal places
            results[i][3] = assignGrade(percentage);
            results[i][4] = assignRemarks(percentage);
        }

        return results;
    }

    // Assign grades based on percentage
    public static String assignGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    public static String assignRemarks(double percentage) {
        if (percentage >= 80) {
            return "Level-4, above agency-normalized standards";
        } else if (percentage >= 70) {
            return "Level-3, at agency-normalized standards";
        } else if (percentage >= 60) {
            return "Level-2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            return "Level-1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            return "Level-1, too below agency-normalized standards";
        } else {
            return "Remedial standards";
        }
    }

    // Display the scorecard
    public static void displayScorecard(int[][] scores, String[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade\tRemarks");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%s\t%s\t%s\t%s\t%s\n", (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2], results[i][3], results[i][4]);
        }
    }
}

