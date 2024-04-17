package q576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void Rise(String input, String input2, String input3) {
		if(input2.equals("+")||input2.equals("-")||input2.equals("*")||input2.equals("/")) {
			int i = Integer.parseInt(input);
			int i2 = Integer.parseInt(input3);
			if(input2.equals("+")) {
				System.out.println(i + " + " + i2 + " = " + (i + i2));
			}else if(input2.equals("-")) {
				System.out.println(i + " - " + i2 + " = " + (i - i2));
			}else if(input2.equals("*")) {
				System.out.println(i + " * " + i2 + " = " + (i * i2));
			}else if(input2.equals("/")) {
				System.out.println(i + " / " + i2 + " = " + (i / i2));
			}
		}else {
			System.out.println(input+" "+input2+" "+input3+" = " + 0);
		}
//		return input3;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");
		bf.close();
		
		Rise(input[0],input[1],input[2]);
	}
}