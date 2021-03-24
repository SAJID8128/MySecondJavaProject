package variables;

public class Local {

	public static void main(String[] args) {
		Local v2 = new Local();
		v2.alex();
		michael();
		v2.alice();
		

	}
	
	private void alex() {
		
		int age = 35;
		System.out.println(" alex is "+age);
		
	}
	
	public static void michael() {
		
		int age = 30;
		System.out.println(" michael is "+age);						
	}
	
	public void alice( ) {
		
		int age = 21;
		System.out.println(" alice is "+age);
	}
	
}
// int age is local variable which are outside the class and inside the method.