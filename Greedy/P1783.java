import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);

		int N=scan.nextInt(),M=scan.nextInt();
		
		
		int max;
		
		if(N==1) {
			max=0;
		}else if(N==2) {
			
			max=(M-1)/2;
			
			max=max>3?3:max;
		}else {
			
			if(M<7) {
				
				max=M-1;
				
				max=max>3?3:max;
				
				
			}else {
				
				max=4+M-7;
				
			}
			
			
		}
		
		System.out.println(max+1);
		
		
		
	}
}
