import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
	}
}