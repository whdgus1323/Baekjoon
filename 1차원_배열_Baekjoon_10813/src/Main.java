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
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] bucket = new int[N];
		
		for (int i = 0; i < bucket.length; i++)
			bucket[i] = i + 1;
		
		int tmp;
		
		int x, y;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			tmp = bucket[x - 1];
			bucket[x - 1] = bucket[y - 1];
			bucket[y - 1] = tmp;
		}
		
		for (int i = 0; i < bucket.length; i++) 
			bw.write(String.valueOf(bucket[i]) + " ");
		
		br.close();
		
		bw.flush();
		bw.close();
    }

}
