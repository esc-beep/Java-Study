import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = 0, max = 0;
		
		for(int i = 1; i < 10; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x >= max) {
				index = i;
				max = x;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}