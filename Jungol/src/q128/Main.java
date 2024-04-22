package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		int count=0;
		for(;;) {
			input = sc.nextInt();
			if(input == 0) {
				sc.close();
				break;
			}else if(input % 3 == 0 || input % 5 == 0){
			}else {
				count++;
			}
		}
		System.out.println(count);
	}

}
