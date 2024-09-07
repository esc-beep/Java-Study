import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		for(int i = 1; i <= x; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken()); 
	        int z = Integer.parseInt(st.nextToken());
	        bw.write("Case #" + i + ": " + y + " + "+ + z + " = " + (y + z) + "\n");
		}
		bw.flush();
		bw.close();
	}
}