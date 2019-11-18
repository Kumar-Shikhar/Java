package JavaBasicConcept;

/*
 * Use of super with methods
 */
class Person 
{ 
    void message() 
    { 
        System.out.println("This is person class"); 
    } 
} 
  
/* Subclass Student */
class Student extends Person 
{ 
	
    void message() 
    { 
    	
        System.out.println("This is student class"); 
    } 
  
    // Note that display() is only in Student class 
    void display() 
    { 
        // will invoke or call current class message() method 
        //message(); 
  
        // will invoke or call parent class message() method 
        super.message(); 
    } 
} 

public class UseofSuperInMethods {

	public static void main(String[] args) {
		Student s = new Student(); 
		  
        // calling display() of Student 
        s.display(); 
        
        Person p = new Student();
        p.message();
        
        

	}

}
