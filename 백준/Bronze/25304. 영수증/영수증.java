import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		int x = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i < x; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			sum = sum + a * b;
		}

		if (sum == total) System.out.println("Yes");
		else System.out.println("No");
		in.close();
	}
}