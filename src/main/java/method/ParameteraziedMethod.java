package method;

public class ParameteraziedMethod {

	public static void main(String[] args) {
		
		ParameteraziedMethod pm= new ParameteraziedMethod();
		
		pm.clientName();
		pm.fullName("Taslima", "Khan");
		pm.fullName("Tahura", "Begum");
		pm.fullName("Shahriar", "Salman");
		pm.salary(1200, 4000);
	}
	
	
	
	public String fullName(String firstName,String lastName) {
		// for dynamic coding
		// two arguments parameterized method
		// both are string arguments
		//parameterized arguments are local variables 

		
		    String fullName=firstName+" "+lastName;
		   System.out.println("Client full name is "+fullName);
		   return fullName;
	}
	
		
	public double salary (double basicSalary, double bonous) {
		double salary = (basicSalary+bonous);
		System.out.println("employee monthly salary is"+" "+salary);
		return salary;
	}
	

		
	
public String clientName() {
	//Zero arguments method
    //static coding
	   String firstName="Faruq";
	   String lastName="Molla";	 
	   String fullName=firstName+" "+lastName;
	   System.out.println("Client full name is "+fullName);
	return fullName;
	
	   
		
	
		
	}

}