package variables;

public class Static {

	static String Lastname; // static variable

	public static void main(String[] args) {
		Static v2 = new Static();
		v2.faruq();
		khaled();
		v2.saleh();
		jui();

	}

	private void faruq() {
		int age = 35;
		Lastname = "Molla";
		System.out.println(" faruq is " + Lastname);

	}

	public static void khaled() {
		Lastname = "Molla";
		int age = 30;
		System.out.println(" khaled is " + Lastname);

	}

	public void saleh() {
		Lastname = "chowdhury";
	}

	public static void jui() {
		Lastname = "Jui";
	}

}
