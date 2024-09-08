import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st1.nextToken());
		int count = Integer.parseInt(st1.nextToken());
		int buckets[] = new int[bucket];
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int bucket1 = Integer.parseInt(st2.nextToken());
			int bucket2 = Integer.parseInt(st2.nextToken());
			int ball = Integer.parseInt(st2.nextToken());
			for(int j = bucket1-1; j <= bucket2-1; j++) {
				buckets[j] = ball; 
			}
		}
		
		for(int i = 0; i < buckets.length; i++) {
			System.out.print(buckets[i] + " ");
		}
	}
}