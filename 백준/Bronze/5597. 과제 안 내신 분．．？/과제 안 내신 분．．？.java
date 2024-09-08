import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean students[] = new boolean[30];
		for(int i = 0; i < 28; i++) {
			int number = Integer.parseInt(br.readLine()) - 1;
			students[number] = true;
		}
		
		for(int i = 0; i < students.length; i++) {
			if(!students[i]) System.out.println(i+1);
		}
	}
}