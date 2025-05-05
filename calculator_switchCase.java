// calculator using switch case
// 1 for  Addition
// 2nd for  Subtraction
// 3rd for Division
// 4th for  Multiplication

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter the case for operation :");
        int n = scanner.nextInt();
        double result;

        switch (n) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 4:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid operation selected.");
        }
    }
}
