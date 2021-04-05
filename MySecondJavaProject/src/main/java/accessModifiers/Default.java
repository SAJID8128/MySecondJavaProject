package accessModifiers;

public class Default {
	
	public static void main(String[] args) {
		EvaluateModifiers check = new EvaluateModifiers();
		check.defaultMethod();		
	}
}
// Methods with 'default' access modifiers can only be accessed from
// its own package or within its own class.

