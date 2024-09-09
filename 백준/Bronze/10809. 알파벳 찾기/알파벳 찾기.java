import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String numbers = br.readLine();
		int alphabet[] = new int[26];
		
		for(int i = 0; i < 26; i++) {
			alphabet[i] = -1;
		}
		
		for(int i = 0; i < numbers.length(); i++) {
			char c = numbers.substring(i, i+1).charAt(0);
			int n = (int) c - 97;
			if (alphabet[n] == -1) alphabet[n] = i;
		}

		for(int i = 0; i < 26; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}