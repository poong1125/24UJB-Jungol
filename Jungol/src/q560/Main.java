package q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
