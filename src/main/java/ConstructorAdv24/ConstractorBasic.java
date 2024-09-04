package ConstructorAdv24;

public class ConstractorBasic {
/*
 * constractor has same name as class name
 *  constructor neither has return or void
 * 
 * What constructor does
	 *     constructor instantiate/initialize instance properties
	 *        instance variable
	 *        Instance method
	 *        instance block
 * 
 * there are two type of constructor
 * 1. user define constructor( you can have as many as 
	       user define constructor as you need)
	       
 * 2. default constructor
 (is user did not create a constructor then Java will 
       provide a default constructor, you do not see it.)
 * 
 * 
 * 
 */
	
	
	
	
	public static void main(String[] args) {
		
		ConstractorBasic cb =new ConstractorBasic();
		cb.fullname("ayon", "khondokar");
		
	}
	
	
	public String fullname (String firstname, String lastname) {
		
		String Fullmane = firstname+ " "+ lastname;
		System.out.println(Fullmane);
		return Fullmane;
		
		
	}

}
