import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] x = new int[9];
		for (int i = 0; i < x.length; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int loc = 0;
		
		for (int i = 0; i < x.length; i++) {
			if(max < x[i]) {
				max = x[i];
				loc = i + 1;
			}
		}
		bw.write(String.valueOf(max) + "\n" + String.valueOf(loc));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
