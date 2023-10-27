import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[] arr = new int[10];
		Set<Integer> intHashSet = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			while(arr[i] >= 42)
				arr[i] %= 42;
			intHashSet.add(arr[i]);
		}
		
		bw.write(String.valueOf(intHashSet.size()));
		
		br.close();
		
		bw.flush();
		bw.close();
	}

}
