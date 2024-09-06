import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		if (x == y && y == z) System.out.println(10000 + x * 1000);
		else if (x == y || y == z) System.out.println(1000 + y * 100);
		else if (x == z) System.out.println(1000 + x * 100);
		else System.out.println(Math.max(Math.max(x, y), z) * 100);
		in.close();
	}
}