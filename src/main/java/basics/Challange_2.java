package basics;

public class Challange_2 {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;
        
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = 0;
        if(num2!=0)
            division = num1 / num2;
        else
            System.out.println("Division by zero");
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}
