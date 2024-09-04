package dynamicCoding;

public class dynamicMethodPrctice {

	public static void main(String[] args) {
		
		dynamicMethodPrctice dyp=new dynamicMethodPrctice();
		dyp.Fullname();
		
		dyp.DynamicFullname("Shahriar", "Sohan");
		dyp.DynamicFullname("Ahmed", "Kobir");
		dyp.DynamicFullname("Humayera", "Juthy");
		
		String UpperCase= dyp.DynamicFullName1("Shahriar", "Samsul").toUpperCase();
		System.out.println(UpperCase);
		
		String LowerCase= dyp.DynamicFullName1("SHAHRAIR", "SAMSUL").toLowerCase();
		System.out.println(LowerCase);
		
	}
	
	
	
	
	public void Fullname() {
		
		String firstName = "Salman";
		String LastName= "Shahriar";
		String Fullname= firstName+" "+LastName;
		System.out.println(Fullname);
		
	}
	
	public void DynamicFullname(String firstName,String LastName) {
		String FullName= firstName+" "+LastName;
		System.out.println(FullName);
		
		
		
	}
	
	
	public String DynamicFullName1(String Firstname, String Lastnmame) {
		
		String Fullname1= Firstname+" "+Lastnmame;
		System.out.println(Fullname1);
		return Fullname1;
				
	}
	
}
