package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int b = sc.nextInt();
		sc.close();
		
		if(a == ('M')) {
			if(b>=18) {
				System.out.println("MAN");
			}else {System.out.println("BOY");
		}		
	}
		if(a == ('F')) {
			if(b>=18) {
				System.out.println("WOMAN");
			}else System.out.println("GIRL");
		}

}
}