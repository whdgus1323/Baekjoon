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
		
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		double[] score = new double[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		double max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if(max < score[i])
				max = score[i];
		}

		double avg = 0;
		for (int i = 0; i < score.length; i++) {
			avg += score[i] / max * 100;
		}
		
		
		bw.write(String.valueOf(avg / score.length));
		
		br.close();
		
		bw.flush();
		bw.close();
    }

}
