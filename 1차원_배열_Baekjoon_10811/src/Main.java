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
		
		int x, y;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] bucket = new int[N];
		
		for (int i = 0; i < bucket.length; i++) 
			bucket[i] = (i + 1);
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			int[] tmpArr = new int[(y - x) + 1];
			
			for (int k = 0; k < tmpArr.length ; k++)
				tmpArr[k] = bucket[(x - 1) + k];
			
			int tmp = 0;
			int start = 0;
			int end = tmpArr.length - 1;
			
			for (int j = 0; j < tmpArr.length / 2; j++) {
				tmp = tmpArr[start];
				tmpArr[start] = tmpArr[end];
				tmpArr[end] = tmp;
				
				start++;
				end--;
			}
			
			for (int j = 0; j < tmpArr.length; j++)
				bucket[j + (x - 1)] = tmpArr[j];
		}
		
		for (int i = 0; i < bucket.length; i++) 
			bw.write(String.valueOf(bucket[i]) + " ");
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}