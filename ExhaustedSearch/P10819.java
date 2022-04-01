import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int N;
	public static int max=0;
	public static int[] arr;
	public static int[] make;
	public static boolean[] used;

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 N=Integer.parseInt(br.readLine());
		 
		 arr=new int[N];
		 make=new int[N];
		 used=new boolean[N];
		 
		
		 
		 StringTokenizer st=new StringTokenizer(br.readLine()," ");
		 
		 
		 for(int i=0;i<N;i++) {
			 
			 arr[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 search(0);
		 
		 
		 System.out.println(max);
		 
		 
		 
	}
	
	public static void search(int n) {
		
		
		if(n==N) {
			
			int temp=0;
			for(int i=0;i<N-1;i++) {
				
				temp+=Math.abs(make[i]-make[i+1]);
				
				
			}
			
			max=Math.max(temp, max);
			return;
			
		}
		
		for(int i=0;i<N;i++) {
			
			if(!used[i]) {
				
				used[i]=true; 
				make[n]=arr[i];
				search(n+1);
				used[i]=false;
				
				
			}
			
			
		}
		
		
	}
	

}
