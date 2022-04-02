import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	

	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
				
		int T=Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			
			int N=Integer.parseInt(br.readLine());
			
			int[] arr=new int[N+1];
			
			arr[0]=1;
			
			for(int j=1;j<=N;j++) {
				
				if(j==1) {
					arr[j]=1;
				}
				
				else if(j==2) {
					
					arr[j]=2;
				}else {
					
					arr[j]=arr[j-1]+arr[j-2]+arr[j-3];
					
					
					
				}
				
				
			}
			
			System.out.println(arr[N]);	
			
			
			
		}
		
		
		
		
		
	
		
	}
	
}




