package conditionalStatements;

import java.util.Scanner;

public class Challange_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score entered.");
        }

        scanner.close();
    }
}
