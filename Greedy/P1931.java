import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	
  public static void main(String[] args) {
	
	  Scanner scan=new Scanner(System.in);
	  
	  
	 ArrayList<Con> list =new ArrayList<Con>();
	 
	 
	 
	  int n=scan.nextInt();
	  
	  
	  
	  for(int i=0;i<n;i++) {
		  
		  int s=scan.nextInt();
		  int e=scan.nextInt();
		  
		  
		  list.add(new Con(s, e));
		
		
		  
		  
		  
	  }
	  list.sort(new Comparator<Con>() {

		@Override
		public int compare(Con o1, Con o2) {
			
			if(o1.getEnd()==o2.getEnd()) {
				
				return o1.getStart()-o2.getStart();
			}
			
			return o1.getEnd()-o2.getEnd();
		}
		  
		  
	});
	  
	
	  int e=0;
	  int count=0;
	  
	  for(int i=0;i<n;i++) {
		  Con con=list.get(i);
		  
		  if(con.getStart()>=e) {
			  count++;
			  e=con.getEnd();
			  
		  }
		  
		  
	  }
	System.out.println(count);
	  
  }


}
class Con{
	
	private int start;
	private int end;

	
	public Con(int s, int e) {
		
		start=s;
		end=e;
		
		
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}
	
	
}
