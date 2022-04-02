import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	

	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int team=N/2>M?M:N/2;
		
		K-=(N-2*team);
		K-=(M-team);
		
		while(K>0) {
			
			team--;
			K-=3;
			
		}
		System.out.println(team);
		
	}
	
}




