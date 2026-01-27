import java.util.Scanner;

public class KBTUGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score between 0 and 100: ");
        double score = scanner.nextDouble();

        String grade;

        if (score >= 95 && score <= 100) {
            grade = "A";
        } else if (score >= 90) {
            grade = "A-";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 75) {
            grade = "B-";
        } else if (score >= 70) {
            grade = "C+";
        } else if (score >= 65) {
            grade = "C";
        } else if (score >= 60) {
            grade = "C-";
        } else if (score >= 55) {
            grade = "D+";
        } else if (score >= 50) {
            grade = "D";
        } else if (score >= 0) {
            grade = "F";
        } else {
            grade = "Incorrect input";
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
