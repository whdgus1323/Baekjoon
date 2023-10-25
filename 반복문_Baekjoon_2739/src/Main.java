import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			int x = scan.nextInt();
			int z = 0;
			if(x>=60) {
				z++;
				if(x>=70) {
					z++;
					if(x>=80) {
						z++;
						if(x>=90) {
							z++;
						}
					}
				}
			}
			if(z==1) System.out.println("D");
			else if(z==2) System.out.println("C");
			else if(z==3) System.out.println("B");
			else if(z==4) System.out.println("A");
			else System.out.println("F");
		}
		
	}

}
