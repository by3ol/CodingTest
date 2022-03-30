import java.util.Scanner;

public class Main {

	public static boolean[] brokenArr=new boolean[10];
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		int channel=scanner.nextInt();
		
		
		
		
		
	
		
		int brokenNum=scanner.nextInt();
		
		
		for(int i=0;i<brokenNum;i++) {
			
			brokenArr[scanner.nextInt()]=true;
			
			
		}
		
		
		
		
		if(channel==100) { //이동하려는 채널이 100번일 때 
			
			System.out.println(0);
			
		}else if(brokenNum==0){ //하나도 안고장났을 때 
			
			System.out.println(length(channel)> Math.abs(channel-100)?Math.abs(channel-100):length(channel) );// ++,--로 이동하는것이랑 번호 치는거랑 비교 
			
		}else if(brokenNum==10) { //다 고장났을 때 
			
			System.out.println(Math.abs(channel-100)); //++,--로 이동하는 숫자 구함 
		}else { //부분적으로 고장났을 떄 
			
			
			if(check(channel)) {  //가려는 채널을 모두 누를 수 있을 때 
				
				System.out.println(length(channel)> Math.abs(channel-100)?Math.abs(channel-100):length(channel) );
				return ;
				
			}
			int count=0;
			
			
			while(true) {
				
				count++;
				
				
				if(channel-count>=0) {
					
					if(check(channel-count)) {
						System.out.println(Math.abs(channel-100)>length(channel-count)+count?length(channel-count)+count:Math.abs(channel-100));
						break;
					}
					
					
					
				}
				
				if(check(channel+count)) {
					
					
					System.out.println(Math.abs(channel-100)>length(channel+count)+count?length(channel+count)+count:Math.abs(channel-100));
					break;
					
				}
				
				
				
				
				
			}
			
		
		}
		

	}
	
	
	public static boolean check(int number) {
		
		int temp=number;
		
		while(true) {
			
			if(brokenArr[temp%10]) {
				
				return false;
			}
			
			temp=temp/10;
			
			if(temp==0) {
				break;
			}
			
		}
		return true;
		
		
	}
	public static int length(int number) {
		
		int temp=number;
		int count=0;
		
		while(true) {
			count++;
			
			temp=temp/10;
			
			if(temp==0) {
				break;
			}
			
		}
		
		
		return count;
	}

}
