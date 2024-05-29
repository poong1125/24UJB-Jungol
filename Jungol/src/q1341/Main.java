package q1341;

import java.util.Scanner;

public class Main {
	public static void 	main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ac = a;
		int count = 0;
		sc.close();
		if(ac <= b) {
			for(int iii = 0; iii <= (b - ac); iii++) {
				count = 0;
				for(int i = 0; i < 3; i++) {
					for(int ii = 0; ii < 3; ii++) {
						count++;
						if((a*count < 10)) {
							System.out.print(a + " * " + count + " =  " + (a*count) + "   ");
						}else {
							System.out.print(a + " * " + count + " = " + (a*count) + "   ");
						}
					}
					System.out.println();
				}
				System.out.println();
				a++;
			}
		}else if(b < ac){
			for(int iii = 0; iii <= (ac - b); iii++) {
			count = 0;
			for(int i = 0; i < 3; i++) {
				for(int ii = 0; ii < 3; ii++) {
					count++;
					if((a * count < 10)) {
						System.out.print(a + " * " + count + " =  " + (a * count) + "   ");
					}else {
						System.out.print(a + " * " + count + " = " + (a * count) + "   ");
					}
				}
				System.out.println();
			}
			System.out.println();
			a -= 1;
		}
			
		}
	}

}
