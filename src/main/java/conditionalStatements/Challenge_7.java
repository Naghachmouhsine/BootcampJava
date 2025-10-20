package conditionalStatements;

import java.util.Scanner;

public class Challenge_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        int days;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = 29;
            default -> {
                System.out.println("Invalid month.");
                scanner.close();
                return;
            }
        }

        System.out.println("Number of days: " + days);
        scanner.close();
    }
}
