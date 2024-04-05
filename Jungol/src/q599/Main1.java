package q599;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		System.out.println(inp);

		// case 2.
		inp = inp.toUpperCase();
//		System.out.println(inp);
		for (int i = 0; i < inp.length(); i++) {
			char c = inp.charAt(i);
			if(Character.isAlphabetic(c)) {
				System.out.print(c);
			}
		}
		
		// case 1.
//		for (int i = 0; i < inp.length(); i++) {
////			System.out.println(inp.charAt(i));
//			char c = inp.charAt(i);
//			if('a' <= c && c <= 'z') {
//				
//				c = (char)(c - 32);
//				System.out.print(c);
//			}else if('A' <= c && c <= 'Z') {
//				
//				System.out.print(c);
//			}
//		}
	}
}