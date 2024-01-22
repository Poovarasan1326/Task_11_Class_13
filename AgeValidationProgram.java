// Custom exception class
package task_11;

class AgeValidationProgramm extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeValidationProgramm(String message) {
		super(message);
	}
}

// Main program
public class AgeValidationProgram {
	// Method to validate age and throw the custom exception if age is less than 18
	public static void validateAge(int age) throws AgeValidationProgramm {
		if (age < 18) {
			throw new AgeValidationProgramm("Age must be 18 or older.");
		}
	}

	public static void main(String[] args) {
		try {
			// Get age from user (you can use Scanner or any other method to get input)
			int userAge = 16;

			// Validate the age
			validateAge(userAge);

			// If age is valid, proceed with the program logic
			System.out.println("Valid age. Proceeding with the program logic...");

		} catch (AgeValidationProgramm e) {
			// Catch the custom exception and display an error message
			System.out.println("Error: " + e.getMessage());
		}
	}
}
