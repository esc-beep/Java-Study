import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		String st = new String(br.readLine());
		for(int i = 0; i < st.length(); i++) {
			char ch = st.substring(i, i+1).charAt(0);
			switch(ch){
		        case 'A' : case 'B' : case 'C' : total += 3; break;
		        case 'D' : case 'E' : case 'F' : total += 4; break;
		        case 'G' : case 'H' : case 'I' : total += 5; break;
		        case 'J' : case 'K' : case 'L' : total += 6; break;
		        case 'M' : case 'N' : case 'O' : total += 7; break;
		        case 'P' : case 'Q' : case 'R' : case 'S' : total += 8; break;
		        case 'T' : case 'U' : case 'V' : total += 9; break;
		        case 'W' : case 'X' : case 'Y' : case 'Z' : total += 10; break;
			}
		}
		System.out.println(total);
	}
}
