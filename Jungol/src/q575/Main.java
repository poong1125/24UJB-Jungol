package q575;

import java.util.Scanner;

public class Main {
	int a;
	int b;
	public Main(int a, int b) {
		this.a = a;
		this.b = b;
		double c = 0;
		
		c = (Math.pow(a,b));
		if(b==0) {
			System.out.println(1);
		} else {
			System.out.println((int)c);
		}
			
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		new Main(a,b);
	}

}
