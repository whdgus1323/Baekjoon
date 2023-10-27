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
		
		int[] arr = new int[N];
		
		int I, J, K;
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			I = Integer.parseInt(st.nextToken());
			J = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			for (int l = I - 1; l < J; l++) 
				arr[l] = K;
		}
		
		for (int s = 0; s < arr.length; s++)
			bw.write(String.valueOf(arr[s]) + " ");
		
		br.close();
		
		bw.flush();
		bw.close();
    }

}