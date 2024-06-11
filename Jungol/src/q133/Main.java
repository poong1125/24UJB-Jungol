package q133;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double sum = 0;
		int aa[] = new int[a];
		for(int i = 0 ; i < a ; i ++ ) {
			aa[i] = sc.nextInt();
			sum += aa[i];
		}
		sc.close();
		double siuu = (double)(sum/(double)a);
		System.out.printf("%.2f",siuu);
	}
}
