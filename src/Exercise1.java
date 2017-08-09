class Exercise1 {
	public static void main(String []args) {
		int a;
		Student obj = new Student();
		System.out.println("Name and age before are : " + obj.getAge() + " and " + obj.getName() );
		obj.setDefaultAge(26);
		obj.setDefaultName("Rudra");
		System.out.println("Name and age After : " + obj.getAge() + " and " + obj.getName());
		System.out.println("--------- Now through 2nd obj ---------- " );
		Student obj1 = new Student();
		obj1.setDefaultAge(26);
		obj1.setDefaultName("Rudra");
		System.out.println("Name and age After : " + obj1.getAge() + " and " + obj1.getName());
		System.out.println("---------- Now through 3rd obj ---------- " );
		Student obj2 = new Student();
		obj2.setDefaultAge(26);
		obj2.setDefaultName("Rudra");
		System.out.println("Name and age by parameterised costructor " + obj2.getAge() + " and " + obj2.getName());
		System.out.println("Name and age by parameterised costructor " + obj2.getAge() + " and " + obj2.getName());
	    System.out.println("Exiercise 1 got ended");
	}
}

class Student {
	 String defaultName, name = getDefaultName();
	 int defaultAge, age = getDefaultAge();
	 
	 public Student() {
		// TODO Auto-generated constructor stub
	}
	 
	 public Student(int defaultAge, String defaultName) {
		 this.defaultAge = defaultAge;
		 this.defaultName = defaultName;
	}
	 public int getAge() {
		return age;
	}
	 
	 public String getName() {
		return name;
	}
	 
	 public void setDefaultAge(int defaultAge) {
		this.defaultAge = defaultAge;
	}
	 
	 public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}
	 
	 public int getDefaultAge() {
		return defaultAge;
	}
	 
	 public String getDefaultName() {
		return defaultName;
	}
}