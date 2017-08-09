/**
 * @author pawan.singh In this Exercise we are checking the flow of static and
 *         non-static members as well as its existence. and here the conclusion
 *         are :- Static member will get executed before non-static. Once the
 *         static member are done with their execution class members will take
 *         place and then the constructor at the time of object creation.
 *
 */
public class Exercise3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static obj = new Static();
		// System.out.println(obj.toString());
	}

}

/**
 * @author pawan.singh
 *
 */
class Static {

	// static block: ...
	static {
		System.out.println("static 1");
	}

	/*
	 * non static block: ...
	 * 
	 */
	{
		System.out.println("non-static block");
	}

	int a = getData(); // we are invoking a non-static method to initialize a
						// non-static variable.
	static int b = getByStaticB(); // we are invoking a static method to
									// initialize a static variable.

	{
		System.out.println("non-static block 2");
	}

	int c = getByStaticC(); // we are invoking a non-static method to initialize
							// a non-static variable.
	// static int d = getData(); // we can not do this, as static member get
	// initialize before instance creation and we can not call
	// getData without instance.

	public Static() {
		// TODO Auto-generated constructor stub
		System.out.println("this is constructor");
	}

	public int getData() {
		System.out.println("initializing non-staic variable A.");
		return 5;
	}

	public static int getByStaticB() {
		System.out.println("initializing static variable B");
		return 10;
	}

	/**
	 * This method is check the flow, that when it's get invoked to initialize a
	 * non-static variable c.
	 */
	public static int getByStaticC() {
		System.out.println("initializing variable C");
		return 10;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "a, b and are : " + a + " ," + b + " and " + c;
		return s;
		// return super.toString();
	}

	static {
		System.out.println("This is a static block");
	}
}