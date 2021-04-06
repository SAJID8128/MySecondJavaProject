package dataType;

public class DoubleDataType {

	public static void main(String[] args) {
		sameRangeOfDecimalData();
		differentRangeOfDecimalData();
		differentRangeOfDecimalData1();

	}

	public static void sameRangeOfDecimalData() {
		float age = 30.5f;
		// int is data type, age is the same name of the variable and 30 is the value.
		double age1 = 2000000000000.6777d;
		double total = age + age1;
		System.out.println(total);

	}

	public static void differentRangeOfDecimalData() {
		double balance = 3000000000000.45688543363663d;
		float balance1 = 400.999999999999999999999999f;
		double total = balance + balance1;
		System.out.println(total);

	}

	// smaller range
	public static void differentRangeOfDecimalData1() {
		double cash = 300000000000000000.9999d;
		float cash1 = 400.456789f;
		float cashTotal = (float) (cash + cash1);
		System.out.println(cashTotal);
	}

}
