// calculator using switch case

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 = Addition (+)");
        System.out.println("2 = Subtraction (-)");
        System.out.println("3 = Division (/)");
        System.out.println("4 = Multiplication (*)");

        int choice = sc.nextInt();
        double result;

        switch (choice) {
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
