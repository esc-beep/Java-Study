import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		for(int i = 0; i < x; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}
		in.close();
	}
}