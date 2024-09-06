import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger A = in.nextBigInteger();
		BigInteger B = in.nextBigInteger();
		BigInteger C = in.nextBigInteger();
		BigInteger sum = A.add(B);
		BigInteger answer = sum.add(C);
		System.out.println(answer);
		in.close();
	}
}