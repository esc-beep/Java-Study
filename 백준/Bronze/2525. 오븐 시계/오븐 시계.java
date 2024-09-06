import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		y += z;
		int temp = 0;
		if (y >= 60) {
			temp = y / 60;
			y = y - 60 * temp;
			x += temp;
			if (x >= 24) x -= 24;
		}
		System.out.println(x + " " + y);
		in.close();
	}
}