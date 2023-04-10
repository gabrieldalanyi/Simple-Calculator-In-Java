import java.util.Scanner;

// Simple Calculator In Java
// Operators ( +, -, *, / )
public class Calculator {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the calculator!");

            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double result = 0.0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }


