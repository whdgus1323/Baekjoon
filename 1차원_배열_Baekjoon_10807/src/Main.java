import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int ref = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) 
			if(Integer.parseInt(st.nextToken())==ref) 
				count++;
		
		bw.write(String.valueOf(count));
		
		br.close();
		
		bw.flush();
		bw.close();
	}
	
}