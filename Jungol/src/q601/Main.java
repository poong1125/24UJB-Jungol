package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();
		char a[] = inp.toCharArray();
			for(int o=0; o < inp.length(); o++) {
				for(int p = ((inp.length()-1)); p <= (inp.length()-1)*(2); p ++) {
				if(inp.length() <= p-o) {
						System.out.print(a[p-(inp.length())-o]);
					}else {
						System.out.print(a[p-o]);	
				}
					}
				System.out.println();
			}
		}
	}


