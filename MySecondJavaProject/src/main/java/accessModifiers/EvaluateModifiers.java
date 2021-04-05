package accessModifiers;


// Class are not allowed 'private' or 'protected' access modifiers.
// Class are only allowed 'public' and 'default' access modifiers.

class Example {
	// Example of a class with a 'default' access modifier.
}


public class EvaluateModifiers {
	

	public void publicMethod() {	
		System.out.println("This is a 'public' method.");
	}
	
	
	private void privateMethod() {	
		System.out.println("This is a 'private' method.");
	}
	
	
	void defaultMethod() {
		System.out.println("This is a 'default' method.");
	}
	
	
	protected void protectedMethod() {
		System.out.println("This is a 'protected' method.");
	}
	
	
	public static void main(String[] args) {
		
		EvaluateModifiers check = new EvaluateModifiers();
		check.privateMethod();		
		// Methods with the 'private' access modifier can only be accessed
		// from within its own class.
	}
	
}



