package oop;

public class Main {
    public static void main(String[] args) {
        // BankAccount example
        BankAccount account = new BankAccount("12345", 500);
        
        // Rectangle example
        Rectangle rect = new Rectangle(10, 5);
        rect.displayInfo();

        // ATM example
        ATM atm = new ATM(account, 1234);
        atm.start();
    }
}
