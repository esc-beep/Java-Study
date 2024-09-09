import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			String st = br.readLine();
			System.out.print(st.charAt(0));
			System.out.print(st.charAt(st.length() - 1));
			System.out.print("\n");
		}
	}
}