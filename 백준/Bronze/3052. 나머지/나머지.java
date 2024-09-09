import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numbers[] = new int[42];
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int number = Integer.parseInt(br.readLine());
			numbers[number % 42] += 1;
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] != 0) count++;
		}
		
		System.out.print(count);
	}
}