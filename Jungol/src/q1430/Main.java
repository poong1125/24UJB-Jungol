package q1430;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int all = A*B*C;
		sc.close();
		int count[] = new int[10];
		for(int i = 0 ; i < 10; i++) {
			count[i] = 0;
		}
		ArrayList<Integer> arrNum = new ArrayList<>();

		while(all > 0) {
			arrNum.add(all %10);
			all /= 10;
		}
		for(int i = 0; i < arrNum.size(); i++) {
			switch(arrNum.get(i)) {
			case 0 :
				count[0] += 1;
				break;
			case 1 :
				count[1] += 1;
				break;
			case 2 :
				count[2] += 1;
				break;
			case 3 :
				count[3] += 1;
				break;
			case 4 :
				count[4] += 1;
				break;
			case 5 :
				count[5] += 1;
				break;
			case 6 :
				count[6] += 1;
				break;
			case 7 :
				count[7] += 1;
				break;
			case 8 :
				count[8] += 1;
				break;
			case 9 :
				count[9] += 1;
				break;
			}

		}
		System.out.println(count[0]);
		System.out.println(count[1]);
		System.out.println(count[2]);
		System.out.println(count[3]);
		System.out.println(count[4]);
		System.out.println(count[5]);
		System.out.println(count[6]);
		System.out.println(count[7]);
		System.out.println(count[8]);
		System.out.println(count[9]);
		
	}
}
