package conditionalStatements;

import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a student ID? (yes/no): ");
        String studentID = scanner.next();

        int price = 0;

        if (age <= 12) {
            price = 5;
        } else if (age <= 17) {
            price = 8;
        } else {
            if(studentID.equals("yes")) {
                price = 10;
            }else if(studentID.equals("no")) {
                price = 15;
            }
        }

        System.out.println("Ticket price: $" + price);
        scanner.close();
    }
}
