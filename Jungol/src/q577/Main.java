package q577;

import java.util.Scanner;

public class Main {
	private int max;
	private int min;
	static int aa[] = new int[2];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		sc.close();
		int min = Math.min(input1, input2);
		int max = Math.max(input1, input2);
		Main a = new Main();
		a.D4C(min,max);
		if(input1 <= input2) {
			System.out.println(aa[0] +" " + aa[1]);
			}else {
				System.out.println(aa[1] +" " + aa[0]);
			}
		
	}
	
	public int[] D4C(int min ,int max) {
		this.min = min;
		this.max = max;
		
		min = min*2;
		max = max/2;

		aa[0] = min;
		aa[1] = max;
		return aa;
	}
}
