import java.util.Scanner;

public class Main {

	private static final int MAX=300000;
	 private static int[]  visited;
	 private static int P;
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		visited=new int[MAX];
		

		
		
		int A =scan.nextInt();
		P=scan.nextInt();
		
		
		
		dfs(A);
		int count=0;
		for(int i=0;i<MAX;i++) {
			if(visited[i]==1) {
			
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	public static void dfs(int num) {
		
		visited[num]++;
		
		if(visited[num]==3) {
			
			return;
		}
		
		int sum=0;
		while(num!=0) {
			
			sum+=Math.pow(num%10, P);
			num/=10;
			
		}
		dfs(sum);
		
	}

	
}
