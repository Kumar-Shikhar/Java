
public class ConstructorChain {
	/*
	 * Rules for writing Constructor:
	 * 1. Constructor(s) of a class must has same name as the class name in which it resides.
	 * 2. A constructor in Java can not be abstract, final, static and Synchronized. Why ?
	 * 
   When you set a method as final it means: "I don't want any class override it. 
   But according to the Java Language Specification:
   JLS 8.8 - "Constructor declarations are not members. 
   They are never inherited and therefore are not subject to hiding or overriding.
   
   When you set a method as abstract it means: 
   "This method doesn't have a body and it should be implemented in a child class.
   But the constructor is called implicitly when the new keyword is used so it can't lack a body.

    When you set a method as static it means: 
    This method belongs to the class, not a particular object.
    But the constructor is implicitly called to initialize an object, so there is no purpose in having a static constructor.

	 * 3. Access modifiers can be used in constructor declaration to control its access i.e which other class can call the constructor.
	 */
	
	
	//Chain using this() keyboard.
	
	public ConstructorChain() {
		this(5);
		System.out.println("Default constructor");
	}
	public ConstructorChain(int a){
		this(2,3);
		System.out.println("Param constructor");
	}
	public ConstructorChain(int a,int b){
		System.out.println("Param constructor result " + a*b);
	}
	

	public static void main(String[] args) {
    
      ConstructorChain cc = new ConstructorChain();
	}

}
