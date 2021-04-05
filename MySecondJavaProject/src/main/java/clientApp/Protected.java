package clientApp;

import modifiers.EvaluateModifiers;

public class Protected extends EvaluateModifiers {

	public static void main(String[] args) {
		Protected obj = new Protected();
		obj.protectedMethod();
				
	}

}
//'Protected' class is a subclass of superclass 'EvaluateModifiers' class.
//'Protected" class inherits all the properties such as the 'protectedMethod'
// from its parent class 'EvaluateModifiers'.
// Thus, we have created an Instance of 'Protected' class to call the
// method with the protected access modifier 'protectedMethod'.
