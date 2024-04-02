package q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 3;
		
		
//		while(true) {
//			int a = sc.nextInt();
//			if(a%b == 0) {
//				System.out.println(a/b);
//			}else if(a == -1) {
//				
//				sc.close();
//				break;
//			}
//		}
		
		
		for(;;) {
			int c = sc.nextInt();
			if(c%b == 0) {
				System.out.println(c/b);
			}else if(c == -1) {
				
				sc.close();
				break;
			}
		}
	}
}
