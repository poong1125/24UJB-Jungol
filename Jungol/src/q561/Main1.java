package q561;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException {
		int min = 0;
		int max = 10000;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a[] = bf.readLine().split(" ");
		int o[] = new int[10];

		for (int i = 0; i < a.length; i++) {
			o[i] = Integer.parseInt(a[i]);
		}

		for (int p = 0; p < o.length; p++) {
			if (o[p] < 100) {
				if (min < o[p]) {
					min = o[p];
				}
			} else {
				if (o[p] < max) {
					max = o[p];
				}
			}
		}
		if (min < 1) {
			min = 100;
		}
		if (max >= 10000) {
			max = 100;
		}
		System.out.println(min + " " + max);

	}

}
