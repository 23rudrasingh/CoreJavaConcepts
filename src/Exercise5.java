
/**
 * @author pawan.singh
 * This program represents creation of class, it's component and uses.
 *
 */

// public is access modifiers, class is keyword, Exercise5 is name. In one java file only one class can be declared as public
public class Exercise5 {

	public static void main(String[] args) {
		Class obj = new Class();
// msg()is defined as private we can not access it out side the class. So its not a good practice to declare it with private access modifier.
		//Class.msg();  
		obj.setA(15);
		System.out.println(obj.getA());

	}

}

class Class {
	//it contains all fields (variables), which should be define before its use.
	private int a;
	// It may contain static or non-static block.
	{
		System.out.println("This is a non-static block");
		Class.msg();
	}
	// it contains parameterized or default constructor.
	public Class() {
		System.out.println("This is Class constructor");
	}
	/* Methods to bind its data. methods can be static or non-static. static methods get place in class area, so it doesn't need instances
	 * to access, we can access it as Class.msg(). static members are common to all of its instances and share among them.
	 * Static method can access only static members. (directly, we can use non-static variables by creating an object, depending on the requirement.)
	 */
	private static void msg() {
		System.out.println("This is in class area");
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
}
