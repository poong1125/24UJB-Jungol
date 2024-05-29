package q1304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char b = 'A';
		sc.close();
		
		for(int i = 0; i < a ; i++) {
			for( int o = 0; o < a; o ++) {
				if(o % 2 == 0) {
					char bb = (char)(b + i + (a*o));
					for(;;) {
						if(65 <= bb && bb < 91) {
							break;
						}else {
						bb -= 26;
						}
					}
					System.out.print(bb+" ");
				}else {
					char bb = (char)(b + (a*o) + (a-i-1));
					for(;;) {
						if(65 <= bb && bb < 91) {
							break;
						}else {
							bb -= 26;
							}
					}
					System.out.print(bb+" ");
				}
			}
			System.out.println();
		}
	}
}

