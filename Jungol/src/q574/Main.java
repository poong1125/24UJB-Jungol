package q574;


import java.util.Scanner;

public class Main {
	
	public int maxmax(int b[]) {
		int aa = b[0];
		for(int i = 0; i < b.length-1; i++) {
			if(b[i]<b[i+1]) {
				aa = (Math.max(b[i], b[i+1]));
			}
		}
	
	return aa;	
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextLine().split(" ");
		sc.close();
		int[] b =new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		
		Main m = null;
		m = new Main();
		int r = m.maxmax(b);
		System.out.println(r);
	}
}
