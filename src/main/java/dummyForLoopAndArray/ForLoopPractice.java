package dummyForLoopAndArray;

public class ForLoopPractice {

	public static void main(String[] args) {
		ForLoopPractice fl =new ForLoopPractice ();
		fl.countApple();
				
	}
	
	public void countApple() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		for (int i = 0; i <=100; i+=5) {
			System.out.println(i);
		}
		for (int i = 1; i <= 100; i++) {
		if (i==10) {break;}
				System.out.println(i);
	}
		for (int i = 5; i >= 1; i--) {
			if (i==0) {break;}
		System.out.println(i);
}
		for (int i = 20; i >=10 ; i--) {
			if (i==15) {break;}
			System.out.println(i);
		}
		for (int i = 1; i <= 50; i+=5) {
			System.out.print(i);
		}
		for (int i = 0; i >=50; i+=2) {
			if(i==12) {break;}
				
			
			System.out.println(i);
		}
	}
	}
