package dataType;

public class UpcastingAndDowncasting {

	public static void main(String[] args) {

		int balance = 4000;// upper level than byte
		byte money = 24;
		int total = balance + money;
		System.out.println(total);
		// this is up casting mean upper level data type can easily hold lower level
		// data type

		byte total1 = (byte) (balance + money);
		System.out.println(total1);

		// this is down casting means if we force to hold upper level data to lower
		// level data
		// then we will lose data.

		String Fname = "Faruq";// lower level than string data type
		Object Lname = "khan";// super Object data type
		Object fullName = Fname + " " + Lname;// no problem with upcasting
		System.out.println(fullName);

		String fullName1 = Fname + " " + Lname;
		System.out.println(fullName1);

		// cross referential data
		int age = 30;
		int tution = 400;
		String studentName = "Rubel";

		Object studentAgeName = age + " " + tution + " " + studentName;
		System.out.println(studentAgeName);
		// converting into String data type

		String studentAgeName1 = age + " " + studentName;
		System.out.println("String coming: " + studentAgeName1);
		// cross referential data
		// String will not covert into String data type.

		// int studentAgeName2=age+" "+studentName;
		// System.out.println("int coming: "+studentAgeName2);

	}

}
