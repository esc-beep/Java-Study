import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < count; i++) {
			arr[i] = Integer.parseInt(st2.nextToken()); 
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[arr.length-1]);
	}
}