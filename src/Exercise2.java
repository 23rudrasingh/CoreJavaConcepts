
/**
 * @author pawan.singh
 * this Exercise is to see when a parrent obj is 
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Parrent objPp = new Parrent();
		Parrent objPc = new Child();
		
		//Child objCp = new Parent();		// Super class reference can't be stored in child class reference variable.
		
		Child objCc = new Child();
		System.out.println("objPp is instance of parrent : " + (objPp instanceof Parrent));
		
		//System.out.println("objPp is instance of Child : " + (objPp instanceof Exercise2));
		/*
		 * Compiler checks compatibility of both operands, it should be matched other wise it will through an error.  
		 */
		
		System.out.println("objPp is instance of Child : " + (objPp instanceof Child));
		System.out.println("objPc is instance of parrent : " + (objPc instanceof Parrent));
		System.out.println("objPc is instance of Child : " + (objPc instanceof Child));
		System.out.println("objCc is instance of parrent : " + (objCc instanceof Parrent));
		System.out.println("objCc is instance of Child : " + (objCc instanceof Child));
		
	}
	
}

class Parrent {
	// add members
}

class Child extends Parrent{
	// add members
}


