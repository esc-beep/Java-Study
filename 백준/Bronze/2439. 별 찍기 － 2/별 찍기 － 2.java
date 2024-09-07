import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		for(int i = 1; i <= A; i++) {
			for(int j = A; j > i; j--) System.out.print(" ");
			for(int j = 1; j <= i; j++) System.out.print("*");
			System.out.print("\n");
		}
		in.close();
	}
}