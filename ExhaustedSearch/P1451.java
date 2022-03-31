import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int[][] input;
	private static long[][] sum;
	private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		 N=Integer.parseInt(st.nextToken());
		 M=Integer.parseInt(st.nextToken());
	
		 input=new int[N+1][M+1];
		 sum=new long[N+1][M+1];
		
		for(int i=1;i<=N;i++) {
			
			String str=br.readLine();
			
			for(int j=1;j<=M;j++) {
				
				
				input[i][j]=str.charAt(j-1)-'0';
			}
			
		}
		

		
		for(int i=1;i<=N;i++) {
			
			
			for(int j=1;j<=M;j++) {
				
				
				sum[i][j]=sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+input[i][j];
		
			}
		}
		
		
		
		
		long max=0;
		
		for(int i=1;i<M-1;i++) {
			//세로 3개 
			for(int j=i+1;j<M;j++) {
				
				long s1=calcSum(1,N,1,i);
				long s2=calcSum(1,N,i+1,j);
				long s3=calcSum(1,N,j+1,M);
				
				max=Math.max(max, s1*s2*s3);
				
			}
			
			
		}
		
		//가로3개 
		for(int i=1;i<N-1;i++) {
			
			for(int j=i+1;j<N;j++) {
				
				long s1=calcSum(1,i,1,M);
				long s2=calcSum(i+1,j,1,M);
				long s3=calcSum(j+1,N,1,M);
				
				max=Math.max(max, s1*s2*s3);
				
			}
			
			
		}
		
		for(int i=1;i<N;i++) {
			
			for(int j=1;j<M;j++) {
				//3
				long s1=calcSum(1,i,1,M);
				long s2=calcSum(i+1,N,1,j);
				long s3=calcSum(i+1,N,j+1,M);
				
				max=Math.max(max, s1*s2*s3);
				
				//4
				 s1=calcSum(1,i,1,j);
				 s2=calcSum(1,i,j+1,M);
				 s3=calcSum(i+1,N,1,M);
				
				max=Math.max(max, s1*s2*s3);
				
				//5
				 s1=calcSum(1,N,1,j);
				 s2=calcSum(1,i,j+1,M);
				 s3=calcSum(i+1,N,j+1,M);
				
				max=Math.max(max, s1*s2*s3);
				
				//6
				 s1=calcSum(1,i,1,j);
				 s2=calcSum(i+1,N,1,j);
				 s3=calcSum(1,N,j+1,M);
				
				max=Math.max(max, s1*s2*s3);
				
				
				
				
			}
			
		}
		
		
		System.out.println(max);
		
		
		
	
		
	}
	
	public static long calcSum(int startY,int endY,int startX, int endX) {
		
		
		return sum[endY][endX]-sum[startY-1][endX]-sum[endY][startX-1]+sum[startY-1][startX-1];
		
		
	}

}
