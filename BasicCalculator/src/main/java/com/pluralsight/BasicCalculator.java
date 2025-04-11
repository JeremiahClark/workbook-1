package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        // Create Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);
// Prompt user for the first number
        System.out.print("Enter the first number: ");
        float num1 = scanner.nextFloat();
// Prompt user for the second number
        System.out.print("Enter the second number: ");
        float num2 = scanner.nextFloat();
// Consume leftover newline
        scanner.nextLine();

        // Display options to the user
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

// Prompt user to select an operation
        System.out.print("Please select an option: ");
        String option = scanner.nextLine(); // Option is read but not used

// Always perform multiplication
        float result = num1 * num2;

// Display result
        System.out.println((int)num1 + " * " + (int)num2 + " = " + (int)result);


// Close the scanner
        scanner.close();
    }
}

