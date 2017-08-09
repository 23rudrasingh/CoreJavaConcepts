
/**
 * @author pawan.singh This exercise explain about 'this' keywords and its uses.
 *         'this' tells about the current reference of the class.
 */
public class Exercise6 {

	public static void main(String[] args) {
		This ob = new This();
		This obj = new This("Rudra");
		ob.setName("Pawan");
		ob.display(obj);
	}

}

class This extends SuperClass {
	String name;

	public This() {
		/*
		 * compiler will try to look for the constructor call at very first
		 * line. If it didn't find any it will add `Super()` which will invoke
		 * its super class constructor. Every class is child of java.lang.object
		 * by default, if it is not to any. An object of class can not be in
		 * existence until Super() of java.lang.object gets invoked that is a
		 * constructor of Object class.
		 */
		// super() will be added by default by compiler as par above I
		// mentioned.
		System.out.println("This is constructor of This class");
	}

	public This(String name) {
		// Here Super() wouldn't be added by default as it found this().
		this();

		// here to handle the ambiguity we use 'this' to refer current instance.
		this.name = name;
		System.out.println("This is constructor of This class");

		/*
		 * By default compiler add `this` keyword to method invocation as
		 * this.display(this). we can use this to pass current reference as
		 * parameter.
		 */
		display(this);
		/*
		 * now this line will execute the method from SuperClass. this is
		 * concept of 'Method Overriding`.
		 */
		super.display(this);
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void display(This ob) {
		System.out.println("I am the This class calling " + ob.name + " and called By : " + this.name);
	}

}

class SuperClass {
	
	public SuperClass() {
		System.out.println("This is SuperClass constructor");
	}

	public void display(This ob) {
		System.out.println("I am the supar class calling : " + ob.name);
	}
}
