package task_11;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {

		String correctPassword = "Apple";

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter your password: ");
			String enteredPassword = scanner.nextLine();

			try {

				if (!enteredPassword.equals(correctPassword)) {

					throw new IncorrectPasswordException("Incorrect password. Please try again.");
				}

				System.out.println("Login successfully....");

			} catch (IncorrectPasswordException e) {

				System.out.println(e.getMessage());
			}
		}
	}
}

class IncorrectPasswordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectPasswordException(String errorMessage) {
		super(errorMessage);
	}
}
