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
		int min = Integer.parseInt(st.nextToken());
		
		int time = Integer.parseInt(br.readLine());
		
		min += time;
		
		while(min >= 60) {
			if(min >= 60) {
				hour += 1;
				min -= 60;
				if(hour >= 24)
					hour = hour - 24;
			}
		}
		
		bw.write(String.valueOf(hour) + " "  + String.valueOf(min));
		
		br.close();
		
		bw.flush();
		bw.close();
	}
	
}