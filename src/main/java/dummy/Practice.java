package dummy;

public class Practice {
public static void main(String[] args) {
	Practice p =new Practice();
	p.forLoop58();
	p.array58();
	p.arrayPractic10();
	
	}
public void forLoop58() {
	
	for (int i = 0; i <=10; i++) {
		System.out.println(i);
	}
	for (int i = 0; i <= 100; i+=2) {
		System.out.println(i);
	
	}
	for (int i = 50; i >=10; i--) {
		System.out.println(i);
	}
	for (int i = 0; i <= 10; i++) {
		if (i==5) {break;}
		System.out.println(i);
	}
	for (int i = 10; i >=0; i--) {
	if(i==5) {break;}
	System.out.println(i);
	}
}
public void array58() {
	String students58[] = {"salman","arafath","shahriar","Samsul","tahmid"};
	for (int i =0; i < students58.length; i++) {
		System.out.println(students58[i]);
		
	}
	for (int i = 0; i < students58.length; i++) {
		if(students58[i].equalsIgnoreCase("shahriar")) {break;}
		System.out.println(students58[i]);
	}
	
	
}



public void arrayPractic10() {
	String students[] = {"ag","da","gfs","dfa","faf"};
	for (int i = 0; i < students.length; i++) {
		System.out.println(students[i]);
	}
	for (int i = 0; i < students.length; i++) {
		if(students[i].equalsIgnoreCase("dfa")) {break;}
		System.out.println(students[i]);
	}
}

}
