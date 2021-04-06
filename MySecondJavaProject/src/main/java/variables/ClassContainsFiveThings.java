package variables;

public class ClassContainsFiveThings {
	// class contains five things
	// variable, constructor, method, static block, instance block

	String FirstName;// variable
	static String LastName;// variable

	public ClassContainsFiveThings() {
		int age;// variable
	}

	// static method
	public static void main(String[] args) {
		ClassContainsFiveThings v1 = new ClassContainsFiveThings();
		v1.m1(35);

	}

	// instance method
	public void m1(int age) {

	}

	// instance block
	{
		int age = 35;

		System.out.println("instance block");
	}
	// static block
	static {
		int age = 35;
		System.out.println("static block");
	}

}
