package q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_height = sc.nextInt();
		int input_bottom = sc.nextInt();
		
		for(int i = 0; i < input_height; i++) {
			for(int o = 0; o <input_bottom;o++) {
				System.out.print(1 + (o + (i * input_bottom))+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
