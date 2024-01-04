package emailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("**** This is an Email Validater ****");
			System.out.println("Enter an email address:  ");
			String input = sc.nextLine();

			if (input.equals("q")) {
				System.out.println("Program exiting. Goodbye!");
				break;
			}

			if (isValidEmail(input)) {
				System.out.println("Valid email address: " + input);
			} 
			else {
				System.out.println("Invalid email address: " + input);
			}
		}

		sc.close();
	}

	// Function to validate an email address using regular expression
		public static boolean isValidEmail(String email) {
			String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(emailRegex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}

}
