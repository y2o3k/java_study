package Two_six;

public class Die {

	public static void printAddDie() {
	for(int i=1; i<=6; i++) {
		for(int j = 1; j<=6; j++) {
			System.out.println(j+ "+" +i+ "=" +(i+j)+ "\t");
		}
		System.out.println();
	}
	System.out.println("---------------------");
}
	
	public static void printMultiDie() {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				System.out.println(i+ "*" +j+ "=" +(i*j)+ "\t");
			
		}
		System.out.println();
	}
	System.out.println("----------------------");
	
		}

	

public static void main(String[] args) {
	
	Die.printAddDie();
	Die.printMultiDie();
	
	Die die = new Die();
	die.printAddDie();
	die.printMultiDie();
}
}