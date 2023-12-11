package src.com.calculator.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    public static int getValidIntegerInput(Scanner scanner, String prompt, int minValue, int maxValue) {
        int input = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();

                if (input >= minValue && input <= maxValue) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a valid integer between " + minValue + " and "
                            + maxValue + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        return input;
    }
        public static boolean isValidCourseNameAndCode(String input) {
            return input != null && !input.trim().isEmpty();
        }
        public static String getNonEmptyStringInput(Scanner scanner, String prompt) {
            String input = "";

            while (input.trim().isEmpty()) {
                System.out.print(prompt);
                input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Invalid input. Please enter a non-empty string.");
                }
                scanner.reset();
            }

            return input;
    }


}
