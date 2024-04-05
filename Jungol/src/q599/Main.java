package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		String b = a.toUpperCase();
		char c[] = b.toCharArray();
		char d[] = a.toCharArray();
		char e[] = a.toCharArray();
		
		
		
		for(int i = 0; i < b.length(); i++) {
			if(c[i] <= 90 && 65<= c[i]) {
				System.out.print(c[i]);
			}
		}
		System.out.println();
		
		for (int i = 0; i < d.length; i++) {
			if(d[i] <= 90 && 65 <= d[i]) {
				System.out.print(d[i]);
			}else if(d[i] <= 122 && 97 <= d[i]) {
				System.out.print((char)(d[i]-32)); 
			}
		}
		System.out.println();
		
		for(int i = 0; i < e.length; i++) {
			if((e[i] <= 90 && 65 <= e[i]) || (e[i] <= 122 && 97 <= e[i])) {
				System.out.print(Character.toUpperCase(e[i]));
			}
		}
	}
	
}
