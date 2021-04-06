package dataType;

public class IntegerDataType {

	public static void main(String[] args) {

		sameRangeOfIntegerData();
		differentRangeOfIntegerData();
		differentRangeOfIntegerData1();

	}

	public static void sameRangeOfIntegerData() {
		int age = 30;
		// int is datatype, age is the same name of the variable and 30 is the value.
		int age1 = 20;
		int total = age + age1;
		System.out.println(total);

	}

	public static void differentRangeOfIntegerData() {
		long balance = 3000000000000l;
		int balance1 = 400;
		long total = balance + balance1;
		System.out.println(total);

	}

	// smaller range
	public static void differentRangeOfIntegerData1() {
		long cash = 300000000000000000l;
		int cash1 = 400;
		int cashTotal = (int) (cash + cash1);
		System.out.println(cashTotal);

	}

}
