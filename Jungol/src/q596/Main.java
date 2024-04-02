package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String eq = sc.next();
		int qrq = sc.nextInt();
		sc.close();
		int i = 0;
		char[] QQ = eq.toCharArray();
		
		
		if(qrq>QQ.length) {
			for(i = 0; i <QQ.length ; i++) {
				System.out.print(QQ[QQ.length -(1+i) ]);
			}
		}else {
			for(i = 0; i < qrq ; i++) {
				System.out.print(QQ[QQ.length -(1+i) ]);
		}

		}
	}

}
