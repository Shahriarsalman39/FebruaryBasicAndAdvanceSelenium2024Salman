package dummy;

public class ArrayPractice {

	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		//ap.countStudent1();
				ap.countStudents56();
	}

	public void countStudent1() {
		
		String [] students = {"tahura","jannat","jamil","salman","Humaira","Oishe"};
		System.out.println(students);
	for (int i = 0; i < students.length; i++) {
		System.out.println(students[i]);
		
	}
	
	for (int i = 0; i < students.length; i++) {
		if (students[i].equalsIgnoreCase("salman")) {break;}
		System.out.println(students[i]);
	}
	
	}
	
	public void countStudents56() {
		String []students5 = {"amin","juthy","fahad","rifath","Mahdi","ali"};
		for (int i = 0; i < students5.length; i++) {
			System.out.println(students5[i]);
			
		}
		for (int i = 0; i < students5.length; i++) {
			if(students5[i].equalsIgnoreCase("fahad")) {break;}
			System.out.println(students5[i]);
		}
	
	}
	
	}
