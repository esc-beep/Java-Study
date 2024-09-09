import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
	
	public static int reverse(int number) {
		int hun = number / 100;
		int ten = (number / 10) % 10;
		int one = number % 10;
		number = one * 100 + ten * 10 + hun;
		return number;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		num1 = reverse(num1);
		num2 = reverse(num2);
		System.out.println(Math.max(num1, num2));
	}
}