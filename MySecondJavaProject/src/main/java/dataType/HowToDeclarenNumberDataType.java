package dataType;

/*
 * author Faruq
 * This class is to show, how to declare number of primitive data type.
 */

public class HowToDeclarenNumberDataType {

	public static void main(String[] args) {
		// whole number data type
		byte balance = 123;
		int checkingBalance = 1234567890;
		// int checkingBalance = 9876543210;
		// Even though it is still 10 digit but no guarentee that java will allow.
		long savingBalance = 1234567890123456789l; // l at the end

		// decimal number
		float money = 123456789.8773f; // f at the end
		double money1 = 123456.656;

		// boolean data type
		boolean t = true;
		boolean f = false;

		// character data type
		char faruq = 'F';

		System.out.println(balance + checkingBalance + savingBalance + money + money1 + faruq);
		System.out.println(t);
		System.out.println(f);

	}

}
