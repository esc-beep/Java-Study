import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = x / 4;
		
		for(int i = 0; i < y; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		in.close();
	}
}