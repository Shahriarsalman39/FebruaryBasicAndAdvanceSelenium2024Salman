 package method;

public class ChildWithMethodOverRidding extends Parent{
	/*
	 * child wants to modify parents method
	 * method signature must be same as parent
	 * if you have different signature than it is a new method
	 * you can not reduce the scope of the method
	 * you can increase the scope
	 * it is dynamic pollymorphism
	 *  
	 * for final, ststic you cannt override
	 * acceess modifier shoud be shame in parend and child class
	 */

	public static void main(String[] args) {
		ChildWithMethodOverRidding child= new ChildWithMethodOverRidding();
		
		child.fulName("Faruq", "Molla");
		child.fulName("shahriar", "Salman");
		child.fulName("s", "a");
		child.fulName1("ahmed", "ullah");
	}

	
	public String fulName(String firstName,String lastName) {
		 String middleName="Omar";	
		 String fullName=firstName+" "+middleName+" "+lastName;
				 System.out.println(fullName);
				return fullName;
		

		 	}
	public String fulName1(String firstName,String lastName) {
		 String middleName="Arafath";	
		 String fullName=firstName+" "+middleName+" "+lastName;
				 System.out.println(fullName);
				return fullName;
	}
		
	
	
	
}