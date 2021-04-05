package clientApp;

import modifiers.EvaluateModifiers;

public class Main {

	public static void main(String[] args) {

		EvaluateModifiers obj = new EvaluateModifiers();
		
		// obj.privateMethod(); cannot be accessed outside its own class
		// because it is a 'private' method.
		

		// obj.defaultMehod(); cannot be accessed outside its own package
		// because it is a 'default' method.

		// obj.protectedMethod(); cannot be accessed outside its own package due
		// to the fact their is no parent/child relationship created through 'inheritance' 
		// between the class 'Main' and the class 'EvaluateModifiers'.
		
		obj.publicMethod();
		// The 'publicMethod' can be accessed from anywhere as it has a 'public' 
		// access modifier.

	}


}
