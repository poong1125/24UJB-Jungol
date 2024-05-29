package q3521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> aa = new ArrayList<>();
		String[] ab	= bf.readLine().split(" ");
		for(int i = 0; i < ab.length; i++) {
			aa.add(Integer.parseInt(ab[i]));
		}
		int N = aa.get(5);
		int a_count =0,b_count=0,c_count=0,d_count =0 ,e_count = 0;
		bf.close();
		if( (1*aa.get(0))+(2*aa.get(1))+(4*aa.get(2))+(8*aa.get(3))+(16*aa.get(4)) < N ) {
			System.out.println("impossible");
		}else {
		for(;;) {
			if(16 <= N && e_count < aa.get(4) ) {
				N -= 16;
				e_count++;
			}else if(8 <= N && d_count < aa.get(3) ) {
				N -= 8;
				d_count++;
			}else if(4 <= N && c_count < aa.get(2) ) {
				N -= 4;
				c_count++;
			}else if(2 <= N && b_count < aa.get(1) ) {
				N -= 2;
				b_count++;
			}else if(1 <= N && a_count < aa.get(0) ) {
				N -= 1;
				a_count++;
			}else if(0 == N) {
				break;
			}
		}System.out.println(a_count + b_count + c_count + d_count + e_count);
		}
	}
}
