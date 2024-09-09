import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = (int) st.nextToken().charAt(0) - 48;
			String letter = st.nextToken();
			for(int j = 0; j < letter.length(); j++) {
				char ch = letter.charAt(j);
				for(int k = 0; k < n; k++) System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
}