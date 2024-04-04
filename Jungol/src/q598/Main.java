package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp = '\0';
		
		
//		C언어 스타일
		
		
//		while (true) {
//			String a = sc.next();
//			char[] b = a.toCharArray();
//			if ((int) b[0] <= 57 && 48 <= (int) b[0]) {
//				int i = b[0];
//				System.out.println((int) i);
//			} else if ((int) b[0] <= 90 && 65 <= (int) b[0]) {
//				System.out.println(b[0]);
//			} else if ((int) b[0] <= 122 && 97 <= (int) b[0]) {
//				System.out.println(b[0]);
//			} else {
//				break;
//			}
//		}
//		sc.close();

		
// 		자바 스타일		
		for(;;) {
			inp = sc.next().charAt(0);
			if(Character.isAlphabetic(inp)) {
				System.out.println(inp);
			}else if(Character.isDigit(inp)) {
				System.out.println((int)inp);
			}else {
				break;
			}
		}
		
	}
}
