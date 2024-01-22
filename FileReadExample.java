package task_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		String filePath = "C://Users//q//Desktop//Class//file.txt";

		try {

			FileReader fileReader = new FileReader(filePath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {

			System.err.println("File not found: " + filePath);
			e.printStackTrace();
		} catch (IOException e) {

			System.err.println("Error reading the file: " + filePath);
			e.printStackTrace();
		} catch (Exception e) {

			System.err.println("An unexpected error occurred");
			e.printStackTrace();
		}
	}
}
