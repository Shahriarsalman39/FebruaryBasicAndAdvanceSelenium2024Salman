package ConstructorAdv24;

public class constructorpractice3 {
int id;
String Firstname;
String LastName;
String Gmail;

public constructorpractice3(int id, String firstname, String lastName, String gmail) {
	super();
	this.id = id;
	Firstname = firstname;
	LastName = lastName;
	Gmail = gmail;
	
	System.out.println(id+" "+firstname+" "+lastName+" "+gmail);
}


	public static void main(String[] args) {
		
		constructorpractice3 cp= new constructorpractice3(12, "Shahriar", "Salman", "ahyuen@gamil.com");
		double SalmanJFee =  cp.JavaFee(1500);
		double SalmanSfee = cp.SeleniumFee(800);
		double TotalFee1= SalmanJFee+SalmanSfee;
		System.out.println("Total due :"+" "+TotalFee1);
	}
	
	
	public double JavaFee(double javaFee1) {
		System.out.println("My Tuition fee for java is :"+" "+javaFee1);
		return javaFee1;
		
		
	}
	
	public double SeleniumFee(double SeleniumFee1) {
		System.out.println("My Tuition fee for selenium is :"+" "+SeleniumFee1);
		return SeleniumFee1;
		
		
	}
	
	
}
