package dataType;

public class IntegerDataType_2 {

	public static void main(String[] args) {
		sameRangeOfIntegerData();
		differentRangeOfIntegerData();

	}

	public static void sameRangeOfIntegerData() {
		int age = 30;
		// int = data type, age is the name of the variable
		// = is the operator
		// 30 is the value
		int age1 = 20;
		int Total = age + age1;
		System.out.println(Total);
	}

	public static void differentRangeOfIntegerData() {
		long balance = 3000000000000000l;
		int balance1 = 400;
		long total = balance + balance1;
		System.out.println(total);

		// smaller range
		long cash = 3000000000000000000l;
		int cash1 = 400;
		int cashTotal = (int) (cash + cash1);
		System.out.println(cashTotal);
	}

}
