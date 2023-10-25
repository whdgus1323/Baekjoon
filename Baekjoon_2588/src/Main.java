import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x>y) System.out.println(">");
			else if(x<y) System.out.println("<");
			else System.out.println("==");
		}
	}

}
