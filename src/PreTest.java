
public class PreTest {

	public static void main(String[] args) {
		Name name = new Name();
		name.getStatic();
	}
}

class Name extends Super{

	int i = getInt();
	String n = getName();
	static int a;

	public Name() {
		System.out.println("constructor");
	}

	private int getInt() {
		System.out.println("int " + n + " !");
		return 10;
	}

	private String getName() {
		System.out.println("String");
		return "Pawan";
	}
	
	public  static void getStatic() {
		a++;
		b++;
		System.out.println(a + " and "+b);
	}

}
