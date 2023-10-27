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
		
		StringTokenizer st;
		
		boolean flag = true;
		int x, y;
		
		while(flag)
		{
			st = new StringTokenizer(br.readLine(), " ");
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());

			if (x==0 && y==0)
				break;
			else bw.write(x + y + "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
	}
	
}