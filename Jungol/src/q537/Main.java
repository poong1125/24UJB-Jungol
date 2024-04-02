package q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int sum = 0;
	int i = 1;
	sc.close();
	
	if(a<=100) {
		while(i <= a) {
			sum += i ;
			i++;
		}
		System.out.println(sum);
		}
	}
}