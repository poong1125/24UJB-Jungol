package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		//int i = 1;
		
		if(a>0) {
			for(int e = 1; e <= a-1; e++) {
				System.out.printf("%d ",e);
			}
		}System.out.println(a);
		
//		if(a>0) {
//			do {System.out.printf("%d ",i);
//				 i++;
//			}while(i <= a-1);
//		}
//		System.out.println(a);
		
//		while(i < a) {
//			System.out.printf("%d ",i);
//			i++;
//		}
//		System.out.println(i);
	}

}
