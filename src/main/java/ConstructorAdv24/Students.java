package ConstructorAdv24;



public class Students {
	  int id;
	  String firstName;
	  String lastName;
	  
	  
	  

		public Students(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println(id +", "+ firstName +", "+ lastName);
	}

		public static void main(String[] args) {
			schoolName();
		  
			Students salaman= new Students(1,"Salman", "Shariar");
			double salamanseleniumFee=salaman.courseJava(500.00);
			double salamanjavaFee=salaman.courseSelenium(1000.00);
			double totalFee=salamanseleniumFee+salamanjavaFee;
			System.out.println("Total due   "+totalFee);
			
		
			
			Students thaidul= new Students(2,"Thaidul", "Alom");
			double thaidulseleniumFee=thaidul.courseJava(600.00);
			double thaiduljavaFee=thaidul.courseSelenium(2000.00);
			double totalthaidulFee=thaidulseleniumFee+thaiduljavaFee;
			System.out.println("Total due   "+totalthaidulFee);
			
		}
		
		public double courseSelenium(double tutionFee) {
			System.out.println(" Selenium fee "+tutionFee);
			return tutionFee;
		}
		
	    public double courseJava(double fee) {
	    	System.out.println(" Java fee "+fee);
			return fee;
		}
	    
	    public static void schoolName() {
	    	System.out.println("Tep");
	    }
	    
	   
	}
