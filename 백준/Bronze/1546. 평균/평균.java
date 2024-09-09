import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int scores[] = new int[count];
		int max = 0;
		double average = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < scores.length; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
			if (scores[i] >= max) max = scores[i];
		}
		
		for(int i = 0; i < scores.length; i++) {
			average += (double) scores[i] / max * 100;
		}

		System.out.print(average/count);
	}
}