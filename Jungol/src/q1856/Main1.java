package q1856;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String aa= "";
		char a = 'A';
		aa += a;
		aa += " B";
		aa+= " C";
		bw.write(aa+"\n");
		bw.flush();
		bw.close();  
		
	}

}
