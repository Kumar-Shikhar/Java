
public class Outer_class {
	 void outerMethod() { 
	        
		 System.out.println("inside outerMethod"); 
	 }
	public class inner_class	{
		
		public void inner_method(){
			System.out.println("In inner class method");
		}
		
	}

	public static void main(String[] args) {
		Outer_class.inner_class in = new Outer_class().new inner_class();
		in.inner_method();
	}
	
}
