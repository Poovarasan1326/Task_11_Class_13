package task_11;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
		}

		try {
			String text = "Hello";
			System.out.println(text.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
		}
	}
}
