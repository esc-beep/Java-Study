import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st1.nextToken());
		int count = Integer.parseInt(st1.nextToken());
		int buckets[] = new int[bucket];
		
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = i + 1;
		}
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int bucket1 = Integer.parseInt(st2.nextToken()) - 1;
			int bucket2 = Integer.parseInt(st2.nextToken()) - 1;
			while(bucket1 < bucket2) {
				int tmp = 0;
				tmp = buckets[bucket1];
				buckets[bucket1] = buckets[bucket2];
				buckets[bucket2] = tmp;
				bucket1++;
				bucket2--;
			}
		}
		
		for(int i = 0; i < buckets.length; i++) {
			System.out.print(buckets[i] + " ");
		}
	}
}