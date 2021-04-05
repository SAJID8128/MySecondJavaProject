package methods;

public class Mixed {
	
	public static void staticMethod() {
		System.out.println("This is a 'static' method.");
		Mixed obj1 = new Mixed();
		obj1.instanceWithinStatic();		
	}
	
	public void instanceMethod() {
		System.out.println("This is an 'instance' method.");
		Mixed obj2 = new Mixed();
		obj2.staticWithinInstance();
	}
	
	public static void staticWithinInstance() {
		System.out.println("This is a 'static' method within an 'instance' method.");
	}
	
	public void instanceWithinStatic() {
		System.out.println("This is an 'instance' method within a 'static' method.");
	}

	public static void main(String[] args) {
		staticMethod();
		Mixed obj1 = new Mixed();
		obj1.instanceMethod();
	}
}
