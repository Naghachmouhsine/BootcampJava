package oop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class ATM {
    private BankAccount account;
    private int pin;
    private ArrayList<String> transactionHistory;

    public ATM(BankAccount account, int pin) {
        this.account = account;
        this.pin = pin;
        this.transactionHistory = new ArrayList<>();
    }

    private boolean verifyPin(int inputPin) {
        return inputPin == pin;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int inputPin = scanner.nextInt();

        if (!verifyPin(inputPin)) {
            System.out.println("Incorrect PIN. Access denied.");
            return;
        }

        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    double balance = account.getBalance();
                    System.out.println("Current balance: $" + balance);
                    transactionHistory.add("Checked balance: " + balance+" at "+ LocalDateTime.now());
                }
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    account.deposit(amount);
                    transactionHistory.add("Deposited: $" + amount+" at "+ LocalDateTime.now());
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    transactionHistory.add("Withdrawn: $" + amount+" at "+ LocalDateTime.now());
                }
                case 4 -> {
                    System.out.println("Transaction History:");
                    for (String t : transactionHistory) {
                        System.out.println(t);
                    }
                }
                case 5 -> System.out.println("Thank you for using the ATM.");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
