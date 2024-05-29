package q1856;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = 0;
		int ss = 0;
		sc.close();

		for (int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int o =0; o < m; o++) {
					s++;
					System.out.print(s+" ");
				}
			}else if(i % 2 == 1) {
				ss += m;
				for(int o =0; o < m; o++) {
					System.out.print(ss + " ");
					ss--;
					s++;
				}

			}
			ss = s;
			System.out.println();
		}
	}
}
