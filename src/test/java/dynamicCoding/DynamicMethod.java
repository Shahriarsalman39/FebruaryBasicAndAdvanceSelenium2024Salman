package dynamicCoding;

public class DynamicMethod {

	public static void main(String[] args) {
		DynamicMethod dm= new DynamicMethod();
		
		//static coding
		dm.fullName();
		
		//dynamic coding with void method (u can't change anything bcz of void)
		/*
		 * in the void method
		 * what ever logics/arguments u made that is final
		  */
		
		dm.dynamicFullname("ayon", "ahmed");
		dm.dynamicFullname("ahmed", "kobir");
		dm.dynamicFullname("arafath", "ahmed");
		
		//dynamic coding with return method( u can change anything like uppercase)
		/*
		 * what ever logis/arguments u made u can take them to another 
		 * method or 
		 * block or 
		 * modify them
		 * 
		 */
		String uppercase= dm.ReturnTypeFullMethod("faruk", "molla").toUpperCase();
		System.out.println(uppercase);
		
		String lowerrcase= dm.ReturnTypeFullMethod("SHAHRIAR", "SOHAN").toLowerCase();
		System.out.println(lowerrcase);
	}
	
	public void fullName() {
		String Firstname = "salman";
		String Lastname = "shahriar";
		String FullName =  Firstname+ " "+ Lastname;
		System.out.println(FullName);
		
		
	}
			
public void dynamicFullname(String Firstname1,String Lastname2) {
	String FullName =  Firstname1+ " "+ Lastname2;
	System.out.println(FullName);
		
		
	}

public String ReturnTypeFullMethod(String Firstname1,String Lastname2) {
	String FullName =  Firstname1+ " "+ Lastname2;
	System.out.println(FullName);
	return FullName;
		
		
	}
}
