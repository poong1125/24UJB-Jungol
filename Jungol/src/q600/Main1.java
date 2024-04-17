package q600;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int count = 0;
		for(int i =0; i < 100 ; i++) {
			char b = a.next().charAt(0);
			if(b == ' ') {
				++count;
			}else if(b == '.'){
				break;
			}
		}
		a.close();
		
		System.out.println(count);
		
	}

}
