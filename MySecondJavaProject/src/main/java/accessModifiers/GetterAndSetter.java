package accessModifiers;

public class GetterAndSetter {
		
	public static void main(String[] args) {
		
		GetAndSet obj = new GetAndSet();
		obj.setName("Faruq Bhai");
		System.out.println(obj.getName());		
	}
}

class GetAndSet {
	
	private String name;
	
	public void setName(String x) {
		
		name = x;
	}
	
	public String getName() {
		
		return name;
	}
}
// We can use the 'getterandsetter' method to call private variables 
// from another class. Here we see that the class named 'GetterAndSetter'
// is using the 'getterandsetter' method to call the private variable 'name'
// from a separate class called 'GetAndSet'.

