package ConstructorAdv24;

public class ConstractorPractice {

	
	
	int  id;
	String Firstname;
	String Lastname;
	String Gmail;
	
	
	
	public ConstractorPractice(int id, String firstname, String lastname, String gmail) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		Gmail = gmail;
		System.out.println(id+","+firstname+","+lastname+","+gmail);
	}


	public static void main(String[] args) {
		
		SchoolName();
		
		
		ConstractorPractice cp= new ConstractorPractice(1, "Shahriar", "Salman", "hjy4@gmail.com");
		double salmanseleniumfee= cp.seleniumFee(500);
		double salmanjavafee= cp.javaFee(1600);
		double totalFee= salmanseleniumfee+salmanjavafee;
		System.out.println("totaldue :" +totalFee);
	}
	
	
	public double seleniumFee(double tuitionfee) {
		System.out.println("Selenium fee :"+tuitionfee);
		return tuitionfee;
		
	}
	public double javaFee(double javafee) {
		System.out.println("java fee :"+javafee);
		return javafee;
		
	}
	
	public static void SchoolName() {
		
		System.out.println("TEP");
	}
}
