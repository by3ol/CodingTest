import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	private static int[][] map;
	private static boolean[][] isVisted;
	private static int[][] dir= {{1,0},{-1,0},{0,1},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
	private static int w;
	private static int h;
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		 int count;
		 
		 
		 while(true) {
			 count=0;
			 w=scan.nextInt();
			  h=scan.nextInt();
			  
			  if(w==0 && h==0)
				  break;
			  
			 map=new int[h][w];
			 isVisted=new boolean[h][w];
			 
			 
			 for(int j=0;j<h;j++) {
				 for(int k=0;k<w;k++) {
					 
					 int value=scan.nextInt();
					 map[j][k]=value;
				 }
				 
			 }
			 

			 
			 for(int j=0;j<h;j++) {
				 for(int k=0;k<w;k++) {
					 
					 if(!isVisted[j][k] && map[j][k]==1) {
						 count++;
						 bfs(j,k);
					 }
				 }
				 
			 }

			 System.out.println(count);
			 
			 
			
		 }
		 
		 
		 
		 
	}
	public static void bfs(int y,int x) {
		
		isVisted[y][x]=true;
		
		Queue<Dir> queue=new LinkedList<Dir>();
		
		queue.add(new Dir(y,x));
		
		while(!queue.isEmpty()) {
			
			Dir curDir=queue.poll();
			
			for(int i=0;i<dir.length;i++) {
				
				int nextY=curDir.getY()+dir[i][0];
				int nextX=curDir.getX()+dir[i][1];
				
				if(nextX>=0 && nextY>=0 && nextX<w && nextY<h ) {
					if(!isVisted[nextY][nextX] && map[nextY][nextX]==1) {
						
						isVisted[nextY][nextX]=true;
						queue.add(new Dir(nextY,nextX));
						
					}
					
				}
			}
			
		}
		
		
		
	}
	
	
}

class Dir{
	
	private int y;
	private int x;
	
	public Dir() {
		
	}
	public Dir(int y,int x) {
		this.y=y;
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
}
