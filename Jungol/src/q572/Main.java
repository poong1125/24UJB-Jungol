package q572;

import java.util.Scanner;

public class Main {
	public double calArea(int Ban) {
		double area = Ban * Ban * 3.14;
		
		return area;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int Ban = sc.nextInt();
	sc.close();
	
	Main m = new Main();
	double area = m.calArea(Ban);
	System.out.printf("%.2f",area);
	
//	Pi pi = new Pi(Ban);
//	
//	}
//}
//
//class Pi{
//	private int Ban;
//	
//		Pi(int Ban){
//		this.Ban = Ban;
//		
//		double S = Ban*Ban*3.14;
//		
//		System.out.printf("%.2f",S);
	}
}