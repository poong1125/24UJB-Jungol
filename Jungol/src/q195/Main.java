package q195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		sc.close();
		Drug drug = new Drug(a, b , c);
		
		System.out.println("name : " +drug.a());
		System.out.println("tel : " + drug.b());
		System.out.println("addr : " +drug.c());
		
	

	}
}

class Drug{
	private String a;
	private String b;
	private String c;
	
	public Drug(String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
				
	}

	public String a() {
		return a;
	}
	public String b() {
		return b;
	}
	public String c() {
		return c;
	}
	
}