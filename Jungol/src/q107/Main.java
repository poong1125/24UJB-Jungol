package q107;

public class Main {

	public static void main(String[] args) {
//		double a = 80.5;
//		double b = 22.34;
//		double sum = a+b;
//		
//		System.out.printf("%10.2f%10.2f%10.2f",a,b,sum);
		Sker sker = new Sker(80.5,22.34);
		
		
	}

}

class Sker{
	private double A;
	private double B;
	
	public Sker(double A, double B){
		this.A = A;
		this.B = B;
		
		System.out.printf("%10.2f%10.2f%10.2f",A,B,A+B);
	}
	
	
	
}
