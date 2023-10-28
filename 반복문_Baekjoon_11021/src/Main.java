import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] x = new int[N];
		int[] y = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (x[i] + y[i]));
		}
	}
	
}