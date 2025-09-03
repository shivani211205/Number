
import java.util.Scanner;

public class Student {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user how many subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks for each subject
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            // Validation
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--; // retry same subject
                continue;
            }
            total += marks[i];
        }

        // Calculate average percentage
        double average = (double) total / n;

        // Grade calculation
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else if (average >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        sc.close() ;
}
}