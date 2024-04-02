package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evencount = 0;
		int oddcount = 0;
//		while(true) {
//			int a = sc.nextInt();
//			if(a != 0 && a%2 == 0) {
//				evencount++;
//			}else if(a%2 == 1) {
//				oddcount++;
//			}else if(a == 0){
//				System.out.print("odd : " + oddcount + "\n" + "even : " + evencount);
//				break;
//			} 
//		}
//		sc.close();
//		}
		for(;;) {
			int q = sc.nextInt();
			if(q == 0 ) {
				System.out.println("odd : " + oddcount + "\n" + "even : " + evencount);
				sc.close();
				break;
				}else {
					switch((q%2)) {
					case 1:
						oddcount++;
						break;
					case 0:
						evencount++;
						break;
					}
		}
	}

}
}