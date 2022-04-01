import java.util.Scanner;

public class Main {

	

	  
	public static void main(String[] args) {
		
		
		  Scanner scan=new Scanner(System.in);
			 
			 
		  int n=scan.nextInt();
		  
		  
		  int[] arr=new int[n+1];
		  
		  arr[1]=0;
		  
		  for(int i=2;i<n+1;i++) {
			  
			  int min=Integer.MAX_VALUE;
			  
			  if(i%3==0 ) {
				 if(min>arr[i/3]) 
					 min=arr[i/3];
			  }
			  if(i%2==0) {
				  if(min>arr[i/2]) 
					min=arr[i/2];
				  
			  }
			  if(min>arr[i-1])
				  min=arr[i-1];
			  
			  arr[i]=min+1;
			  
		  }
		  
		  System.out.println(arr[n]);
		
	}
	  
}
