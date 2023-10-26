package 조건문_Baekjoon_2480;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
				
		int result = 0;
		int k = x;
		
		if(x == y && y == z) {
			result += (10000 + (x * 1000));
		}
		else if(x == y || x == z || y ==z) {
			if(x == y) result += (1000 + (x * 100));
			else if(x == z) result += (1000 + (x * 100));
			else result += (1000 + (z * 100));
		}
		else {
			k = (k < y ? y : k);
			k = (k < z ? z : k);
			result += (k * 100);
		}
		
		bw.write(String.valueOf(result));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
