package conditionalStatements;

import java.util.Scanner;

public class Challenge_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble();
        while (weight < 0) {
            scanner.nextLine();
            System.out.print("Weight must be positive, Enter your weight (kg): ");
            weight = scanner.nextDouble();
        }

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();

        while (height < 0) {
            scanner.nextLine();
            System.out.print("Height must be positive, Enter your height (kg): ");
            height = scanner.nextDouble();
        }

        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        scanner.close();
    }
}
