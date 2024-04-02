package q571;

import java.util.Scanner;

public class Main1 {
	public void  PrintStr() {
		System.out.println("!@#$^&*()_+|");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	sc.close();
	
	System.out.println(a);
	
	Main1 main =new Main1();
	for(int i=0;i<a;i++) {
		main.PrintStr();
	}
	}

}
