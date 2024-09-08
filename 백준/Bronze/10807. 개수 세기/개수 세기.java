import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		int x = Integer.parseInt(br.readLine());
		int[] arr = new int[x];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < x; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int y = Integer.parseInt(br.readLine());
		for(int i = 0; i < arr.length; i++) {
			if (y == arr[i]) count++;
		}
		System.out.println(count);
	}
}