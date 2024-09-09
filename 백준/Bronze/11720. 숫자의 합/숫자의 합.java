import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int sum = 0;
		String numbers = br.readLine();
		for(int i = 0; i < count; i++) {
			int n = Integer.parseInt(numbers.substring(i, i+1));
			sum += n;
		}
		System.out.println(sum);
	}
}
