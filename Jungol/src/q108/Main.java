package q108;

public class Main {

	public static void main(String[] args) {
		int a = 50;
		double b = 100.12;
		Sker Integer = new Sker(a,b);
		
	}
}

class Sker {
	private int a;
	private double b;
	
		Sker(int a, double b){
			this.a = a;
			this.b = b;
			
			System.out.println(a + " * " +b + " = " + (int)(a*b));
	}
	
	
}
