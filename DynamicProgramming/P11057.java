
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		int N=new Scanner(System.in).nextInt();
		
		int[][] arr=new int[N+1][10];
		
		
		for(int i=0;i<10;i++) {
			
			arr[1][i]=1;
		}
		
		for(int i=2;i<N+1;i++) {
			
			for(int j=0;j<10;j++) {
				
				if(j==0) {
					arr[i][j]=1;
				}else {
					
					
					arr[i][j]=(arr[i-1][j]+arr[i][j-1])%10007;
					
				}
				
				
			}
			
		}
		
		int sum=0;
		
		for(int i=0;i<10;i++) {
			
			sum=(sum+arr[N][i])%10007;
		}
		
		System.out.println(sum);
		
		
	}
}
