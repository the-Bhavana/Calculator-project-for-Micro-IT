import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner reader = new Scanner(System.in);

        // Declare variables to store the two numbers and the operator.
        double num1, num2;
        char operator;

        // Prompt the user to enter the first number.
        System.out.print("Enter the first number: ");
        // Read the first number entered by the user.
        num1 = reader.nextDouble();

        // Prompt the user to enter the operator (+, -, *, /).
        System.out.print("Enter an operator (+, -, *, /): ");
        // Read the operator entered by the user. We only take the first character.
        operator = reader.next().charAt(0);

        // Prompt the user to enter the second number.
        System.out.print("Enter the second number: ");
        // Read the second number entered by the user.
        num2 = reader.nextDouble();

        // Declare a variable to store the result of the calculation.
        double result;

        // Use a switch statement to perform the calculation based on the operator.
        switch (operator) {
            // Case for addition.
            case '+':
                result = num1 + num2;
                break;

            // Case for subtraction.
            case '-':
                result = num1 - num2;
                break;

            // Case for multiplication.
            case '*':
                result = num1 * num2;
                break;

            // Case for division.
            case '/':
                // Check if the second number is zero to prevent division by zero error.
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    // Display an error message if the user tries to divide by zero.
                    System.out.println("Error! Division by zero is not allowed.");
                    // Exit the program as the operation is invalid.
                    return;
                }
                break;

            // Default case if the entered operator is not one of the valid operators.
            default:
                System.out.println("Error! Invalid operator.");
                // Exit the program as the operator is invalid.
                return;
        }

        // Display the result of the calculation to the user.
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        // Close the Scanner object to release system resources.
        reader.close();
    }
}