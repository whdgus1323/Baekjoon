package 조건문_Baekjoon_2480;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x > 0 && y > 0) bw.write(String.valueOf(1));
		else if(x < 0 && y > 0) bw.write(String.valueOf(2));
		else if (x > 0 && y < 0) bw.write(String.valueOf(4));
		else bw.write(String.valueOf(3));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
