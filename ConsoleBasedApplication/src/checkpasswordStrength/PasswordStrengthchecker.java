package checkpasswordStrength;

import java.util.Scanner;

public class PasswordStrengthchecker {

//	Function to check password strength
	public static String chkPaswordStrength(String password) {
		int StrengthScore = 0;

//		Rule1: minimum length
		if (password.length() >= 8){
			StrengthScore++;
		}

//		Rule2: At least one uppercase
		if (password.matches(".*[A-Z].*")) {
			StrengthScore++;
		}

//		Rule3 : At least one lowerCase
		if (password.matches(".*[a-z].*")) {
			StrengthScore++;
		}

//			Rule4: At least one special character 
		if (password.matches(".*\\d.*")) {
			StrengthScore++;
		}

//			Rule5: At least one digit
		if (password.matches(".*[!@#$%^&*()\\-+].*")) {
			StrengthScore++;
		}

//			Determine strength based on score
		if (StrengthScore == 5) {
			return "strong";
		} else if (StrengthScore >= 3) {
			return "medium";
		} else {
			return "easy";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		take password input from the user
		System.out.println("Enter your password: ");
		String password = sc.nextLine();

//		Check Strength 
		String strength = chkPaswordStrength(password);

//		Show result
		System.out.println("Your password strength is: " + strength);

		sc.close();
	}
}
