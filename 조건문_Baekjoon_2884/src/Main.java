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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken()) - 45;
				
		if(min < 0) {
			min = 60 + min;
			hour -= 1;
			if(hour < 0)
				hour = 24 + hour;
		}
		
		bw.write(String.valueOf(hour) + " "  + String.valueOf(min));
		
		br.close();
		
		bw.flush();
		bw.close();
	}
	
}