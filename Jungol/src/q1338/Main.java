package q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int spb = 1;
		int inpp = 0;
		int minus = input - 1;
		char Astart = 'A';
		char Astart2 = 'A';
		sc.close();
		
		for(int i = 0; i < input; i++) {
			minus = input-1;
			for(int o = 0; o < input-spb ; o++) {
				System.out.print("  ");
			}
			spb++;
			for(int o = 0; o < 1 + inpp ; o ++) {
				if(1 <= o) {
					for(;;) {
					if(65 <= (Astart2 + minus) && (Astart2 + minus) <= 90) {
						break;
					}else {
						Astart2 -= 26;
					}
					}
					System.out.print((char)(Astart2 + minus)+" ");
					Astart2 = (char) (Astart2 + minus);
					minus--;
					
				}else if(o == 0){
					if(65 <= Astart && Astart < 91) {
					}else {
						Astart -= 26;
					}
				System.out.print(Astart + " ");
				Astart2 = Astart;
				Astart++;
				}
			}
			inpp++;
			System.out.println();
		}
	}
	
	
}

