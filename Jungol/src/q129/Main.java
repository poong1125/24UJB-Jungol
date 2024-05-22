package q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int input_bottom = sc.nextInt();
			int input_height = sc.nextInt();
			System.out.print("Base = ");
			System.out.print("Height = ");
			double hap = ((double)input_bottom*(double)input_height)/2;
			System.out.printf("Triangle width = %.1f\n" ,  hap );
			String input = sc.next();
			//char c = '\0';
			//c = sc.next().charAt(0); 도 가능
			if(input.equals("Y")) {
				System.out.print("Continue? ");
			}else if(input.equals("y")) {
				System.out.print("Continue? ");
			}else {
				System.out.print("Continue? ");
				break;
			}
		}
		sc.close();
		
		//캐릭터 형 변수 를 null로 초기화 하고 싶을 때는 char c = '\0'; 이렇게 하면됨
	}


}
