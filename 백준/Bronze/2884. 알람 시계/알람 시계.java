import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (y >= 45) y -= 45;
		else {
			x -= 1;
			y = y + 60 - 45;
			if (x < 0) x = 23;
		}
		System.out.println(x + " " + y);
		in.close();
	}
}