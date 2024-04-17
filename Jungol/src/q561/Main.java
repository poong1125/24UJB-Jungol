package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		
		int min = 0;
		int max = 10000;
		for(int i = 0; i < a.length; i++) {
			if( a[i] < 100) {
				if(min < a[i]) {
					min = a[i];
				}
			}
			if(a[i] >= 100) {
				if ( max >= a[i]) {
					max = a[i];
				}
			}
		}
		if(min<1) {
			min=100;
		}
		if(max>=10000) {
			max=100;
		}
		System.out.print(min+" ");
		System.out.println(max);
	}

}
