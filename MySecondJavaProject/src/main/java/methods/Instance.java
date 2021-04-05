package methods;

public class Instance {
	
	public void instanceMethod() {
		
		System.out.println("This is an 'instance' method.");
	}

	public static void main(String[] args) {
		
		Instance obj = new Instance();
		obj.instanceMethod();
		
	}
	
}
// Instance method are methods which require an object 
// of its class to be created before it can be called. 
