import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	private static int[][] map;
	private static boolean[][] isVisited;
	private static  int size;
	private static ArrayList<Integer> list;

	private static int count;
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		 size=scan.nextInt();
		
		 
		map=new int[size][size];
		
		 isVisited=new boolean[size][size];
		
		
		
		for(int i=0;i<size;i++) {
			
				
				String line=scan.next();
				for(int j=0;j<size;j++) {
					map[i][j]=line.charAt(j)-'0';
					
				}
				
		}
		list=new ArrayList<Integer>();
	
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size;j++) {
				
				if(!isVisited[i][j] && map[i][j]==1) {
					count=0;
					dfs(i,j);
					list.add(count);
				}
				  
			}
			
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		
		for(int num : list) {
			System.out.println(num);
		}
		
	}
	
	public static void dfs(int y,int x) {
		
		if(y < 0 || x < 0 || y>=size || x >= size) {
			
				return ; 
				
			
			
		}
		
		else if(isVisited[y][x] || map[y][x]==0) {
			return ; 
			
		}
		
		isVisited[y][x]=true;
		count++;
		
		dfs(y+1, x);
		dfs(y, x+1);
		dfs(y-1, x);
		dfs(y, x-1);
		
		
	}

}

