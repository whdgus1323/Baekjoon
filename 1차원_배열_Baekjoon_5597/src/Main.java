import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] arr = new boolean[31];
		
		for (int i = 0; i < 28; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n] = true;
		}
		
		for (int i = 1; i < arr.length; i++)
			if(!arr[i])
				bw.write(String.valueOf(i) + "\n");
		
		br.close();
		
		bw.flush();
		bw.close();
    }

}
