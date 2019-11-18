import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjectCreation() {
		// TODO Auto-generated constructor stub
		System.out.println("default Constructor called ");
	}

	public ObjectCreation(String parameter) {
		// TODO Auto-generated constructor stub
		System.out.println("param Constructor called " + parameter);
	}

	private void dsiplay(String str) {
		System.out.println("Method called by object :" + " " + str);

	}

	/*
	 * Ways to Create object in java 1) Using new Keyword 2) Using New Instance
	 * : If we know the name of the class & if it has a public default
	 * constructor we can create an object –Class.forName. We can use it to
	 * create the Object of a Class. Class.forName actually loads the Class in
	 * Java but doesn’t create any Object. To Create an Object of the Class you
	 * have to use the new Instance Method of the Class. 3) Using clone() method
	 * : To use clone() method on an object we need to implement Cloneable &
	 * define the clone() method in it. 4) Using deserialization 5) Using
	 * newInstance() method of Constructor class
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException,
	CloneNotSupportedException, IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		ObjectCreation oc = new ObjectCreation();
		oc.dsiplay("of new");
		ObjectCreation oc1 = new ObjectCreation("Provided String");
		oc1.dsiplay("of new with param constructor");
		@SuppressWarnings("rawtypes")
		Class cls = Class.forName("ObjectCreation");
		ObjectCreation oc2 = (ObjectCreation) cls.newInstance();
		oc2.dsiplay("of new instance");
		// clone object working
		ObjectCreation oc3 = (ObjectCreation) oc2.clone();
		oc3.dsiplay("of clone");

		// Serialization

		FileOutputStream fOutputStream = new FileOutputStream("file.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				fOutputStream);
		ObjectCreation oc4 = new ObjectCreation();
		objectOutputStream.writeObject(oc4);

		// Deserialization

		FileInputStream fileInputStream = new FileInputStream("file.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(
				fileInputStream);
		ObjectCreation oc5 = (ObjectCreation) objectInputStream.readObject();
		oc5.dsiplay(" of deserialization");
		
		//Constructor 
		
		Constructor<ObjectCreation> cs = ObjectCreation.class.getDeclaredConstructor();
		ObjectCreation oc6 = cs.newInstance();
		oc6.dsiplay("of constructor ");

	}

}
