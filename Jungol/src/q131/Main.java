package q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		for(int i = Math.min(a, b); i <= Math.max(a,b); i++) {
			System.out.print(i+" ");
		}
	}

}
