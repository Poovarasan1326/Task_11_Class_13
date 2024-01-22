package task_11;

import java.util.Scanner;

public class DivisionProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter the first integer: ");
			int numerator = scanner.nextInt();

			System.out.print("Enter the second integer: ");
			int denominator = scanner.nextInt();

			double result = divide(numerator, denominator);

			System.out.println("Result of division: " + result);

		} catch (ArithmeticException e) {

			System.out.println("Error: Cannot divide by zero. Please enter a non-zero second number.");

		} catch (java.util.InputMismatchException e) {

			System.out.println("Error: Please enter valid integers.");

		} finally {

			scanner.close();
		}
	}

	private static double divide(int numerator, int denominator) {
		if (denominator == 0) {

			throw new ArithmeticException("Division by zero is not allowed.");
		}

		return (double) numerator / denominator;
	}
}
