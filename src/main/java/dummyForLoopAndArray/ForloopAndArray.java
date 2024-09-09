package dummyForLoopAndArray;

public class ForloopAndArray {

	public static void main(String[] args) {
		ForloopAndArray fl= new ForloopAndArray();
		//fl.Forloop58();
		fl.Arraypractice();
	}
	public void Forloop58() {
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i <=20; i+=2) {
			System.out.println(i);
		}
		for (int i =50; i >=0; i-=5) {
			System.out.println(i);
		}
		for (int i =100; i >=75; i-=5) {
			if(i==75) {break;}
			System.out.println(i);
		}
		for (int i =56; i <=100; i+=4) {
			if(i==80) {break;}
			System.out.println(i);
		}
		
	}
	public void Arraypractice() {
		
		String students[]= {"salman","ahmed","jamail","khalid","kamal","fahad","topu"};
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		for (int i = 0; i < students.length; i++) {
		if(students[i].equalsIgnoreCase("kamal")){break;}
		System.out.println(students[i]);
		
		}	
	}
	
}

