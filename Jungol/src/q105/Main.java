package q105;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		DecimalFormat a = new DecimalFormat("###,###");
		DecimalFormat b = new DecimalFormat("+###,###");
		String bb = b.format(29774);
		String bb1 = b.format(91375);
		String bb2 = b.format(5868);
		String bb3 = b.format(64888);
		String bb4 = b.format(17230);
		
		String str = a.format(1454636);
		String str1 = a.format(2511676);
		String str2 = a.format(2758296);
		String str3 = a.format(3567910);
		String str4 = a.format(10312545);
		
		System.out.printf("%15s%15s%15s\n","Seoul",str4,bb1);
		System.out.printf("%15s%15s%15s\n","Pusan",str3,bb2);
		System.out.printf("%15s%15s%15s\n","Incheon",str2,bb3);
		System.out.printf("%15s%15s%15s\n","Daegu",str1,bb4);
		System.out.printf("%15s%15s%15s","Gwangju",str,bb);
		
	

		
	}

}
