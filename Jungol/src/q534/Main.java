package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		sc.close();
		
		switch(a) {
		case 65 :
			System.out.println("Excellent");
			break;
		case 66 :
			System.out.println("Good");
			break;
		case 67 :
			System.out.println("Usually");
			break;
		case 68 :
			System.out.println("Effort");
			break;
		case 70 :
			System.out.println("Failure");
			break;
		default :
		System.out.println("error");	
		}
	}

}
