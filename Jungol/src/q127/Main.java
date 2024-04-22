package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count=0;
		while(true) {
			int input = sc.nextInt();
			sum += input;
			count++;
			if(100 < input || input < 0) {
				sum -= input;
				count--;
				break;
			}
		}
		double avg = ((double)sum/(double)count);
		sc.close();
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f",avg);
	}

}
