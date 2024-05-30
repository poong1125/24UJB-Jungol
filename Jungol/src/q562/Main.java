package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		
		int sum =0;
		double avg =0;
		for(int i = 0; i < 10; i++) {
		if(count % 2 == 0) {
			avg += (double)a[count];
			count++;
		}else {
			sum += a[count];
			count++;
		}
		}
		
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",(avg/5));
	}

}
