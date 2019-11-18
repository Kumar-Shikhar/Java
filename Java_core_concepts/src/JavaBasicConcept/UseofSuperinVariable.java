package JavaBasicConcept;

class parent {
	int i = 150;
}

class base extends parent {
	int i = 100;

	void display() {
		System.out.println(i);
		// for caling parent class variable use super
		System.out.println(super.i);
	}
}

public class UseofSuperinVariable {

	public static void main(String[] args) {
		base b = new base();
		b.display();

		// so for calling var of parent class we have used super in above logic
		base b1 = new base();
		b1.display();
	}

}
