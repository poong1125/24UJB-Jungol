package q597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = 	sc.next();
		String B = sc.next();
		sc.close();
		
		
		int a = 0;
		int b = 0;
		char[] C = A.toCharArray();
		char[] D = B.toCharArray();
		
		for(int i = 0; i < C.length; i++) {
			a++ ;
			}
		for(int o = 0; o < D.length; o++) {
			b++ ;
			}
		System.out.println(a+b);
		
	}
}
