package q1338;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		String spacebar ="";
		int spacebar_num = 1;
		int input = Integer.parseInt(bf.readLine());
		int sp_count = 0;
		char Ast = 'A';
		char Ast2 = 'A';
		int ing = 1;
		
		for( int i = 0; i < input; i++) {
			spacebar = "";
			sp_count = 0;
			ing=1;
			for( int o = 0; o < input; o++ ) {
				if(o < input - spacebar_num) {
					spacebar += "  ";
					sp_count++;
				}else if((input-1)-i == sp_count) {
					if(90 < Ast) {
						Ast -= 26;
					}
					spacebar += Ast;
					Ast2 = Ast;
					Ast++;
					sp_count++;
				}else {
					Ast2 += (input)-ing;
					for(;;) {
					if(90 < Ast2) {Ast2-=26;}
					else {break;}
					}
					spacebar += " " + Ast2;
					ing++;
				}
			}
			spacebar_num++;
			bw.write(spacebar+"\n");
			bw.flush();
			sp_count++;
		}
	}

}

