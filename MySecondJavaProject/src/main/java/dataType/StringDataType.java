package dataType;

public class StringDataType {

	public static void main(String[] args) {
		concatination();

	}

	public static void concatination() {
		String First = "Saleh";
		String Last = "Chowdhury";
		// + is the only operator who is doing two functions
		// first is addition
		// second is concatenation
		// this is why it is called overloaded operator.
		String fullname = First + " " + Last;

		System.out.println("His full name is " + fullname);
	}

}
