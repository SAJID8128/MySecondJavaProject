package variables;


public class Instance {
	
		int age; //Instance variable
		
		
		public static void main(String[] args) {
			Instance v2 = new Instance();
			v2.mark();
			matthew();
			v2.john();	
		
		}
		
		private void mark() {
			age = 35;
			System.out.println(" mark is "+age+" years old");
			
		}
		
		public static void matthew() {
			Instance v2 = new Instance();
			v2.age = 30;
			System.out.println(" matthew is "+v2.age+" years old");
		}
		
		public void john() {
			age = 21;
			System.out.println(" john is "+age+" years old");
		}
		
		
}
