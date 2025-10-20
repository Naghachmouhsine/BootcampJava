package conditionalStatements;

import java.util.Scanner;

public class Challange_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age<=0)
            System.out.println("Invalid age entered.");
        else if (age < 13) {
            System.out.println("Child.");
        } else if (age <= 19) {
            System.out.println("Teenager.");
        } else {
            System.out.println("Adult.");
        }
        // Close the scanner
        scanner.close();
    }
}
