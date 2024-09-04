package ConstructorAdv24;

public class constructorPractice2 {

	int id;
	String F_name;
	String L_name;
	String Phone;
	
	public constructorPractice2(int id, String f_name, String l_name, String phone) {
		super();
		this.id = id;
		F_name = f_name;
		L_name = l_name;
		Phone = phone;
		System.out.println(id+" "+f_name+" "+l_name+" "+phone);
	}



	public static void main(String[] args) {
		InstituteName();
		
		
		constructorPractice2 cp2= new constructorPractice2(2, "Salman", "Shahriar", "017423792825");
		double spokenfee= cp2.SpokenFee(500);
	double ieltsfee=	cp2.IeltsFee(1500);
double cbfee= cp2.ComputerBasicFee(1200);
double TotalFee = spokenfee+ieltsfee+cbfee;
System.out.println("Total due :"+ TotalFee);



constructorPractice2  salman= new constructorPractice2(3, "Arman", "Malik", "+091132486");
double spokenfee1=salman.SpokenFee(200);
double ielts25=salman.IeltsFee(280);
double comp=salman.ComputerBasicFee(800);
double totalfee= spokenfee1+ielts25+comp;
System.out.println("total due :"+ totalfee);



	}
	
	
	public double SpokenFee(double spokenfee) {
		System.out.println("spoken tuition fee :"+" "+spokenfee);
		return id;
		
	}

	
	public double IeltsFee(double ieltsfee){
		System.out.println("spoken tuition fee :"+" "+ieltsfee);
		return id;
		
		
	}
	
	
	public double ComputerBasicFee(double cBfee) {
		System.out.println("spoken tuition fee :"+" "+cBfee);
		return id;
		
		
	}
	
	
	public static void InstituteName() {
		System.out.println("Hexas");
		
	}
}
