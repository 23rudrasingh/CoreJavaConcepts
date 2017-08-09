
/**
 * @author pawan.singh
 * This Exercise is related to data types.
 */
public class Exercise4 {
	public static void main(String[] args) {

		Variables obj = new Variables("Pawan", (byte) 26, 'M', 32534l, 4513, 4651.23f);

		/*
		 * while passing as argument we have to give type conversion explicitly
		 * otherwise it wouldn't, like 4651.23f for upper casting. by default
		 * long, byte will be treated as int and floating value as double and we
		 * can not pass int to byte and double to float implicitly we need to
		 * type-cast it for conversion or we have to mention it by f or l.
		 */
		System.out.println(obj.toString());
	}
}

class Variables {
	String name;
	byte age;
	char gender;
	int following;
	long followers;
	float salary;

	// double property; // is not being used basically for currency
	public Variables(String name, byte age, char gender, long followers, int following, float salary) {
		
		this.age = age;
		this.followers = followers;
		
		// we can assign int to long(typecasting implicit) but we can't assign long to int.
		this.following = following; 
		this.name = name;
		this.salary = salary;
		// this.property = prooperty;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Name : " + name + "";
		return super.toString();
	}
}
