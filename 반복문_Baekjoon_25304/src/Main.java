import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		
		int x, y;
		
		int sum = 0;
		
		StringTokenizer st;
		
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			sum += x * y;
		}
		
		bw.write((sum == total) ? "Yes" : "No");
		br.close();
		
		bw.flush();
		bw.close();
	}
	
}