package q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		Ddd(a);
	}

	public static void Ddd(int a) {
		int count = 0;
		for (int i = 1; i <= a; i++) {
			for (int o = 1; o <= a; o++) {
				System.out.print(o + count);
				if (o % a == 0) {
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			count += a;
		}
	}
}
