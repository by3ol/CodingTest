
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	//그래프 하나 아닐때도 고려해줘야함 
	static ArrayList<ArrayList<Integer>> list;
	static boolean[] visited;
	static boolean[] color;
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		int testCase=scan.nextInt();
		list=new ArrayList<ArrayList<Integer>>();
		
		
		
		for(int i=0;i<testCase ;i++) {
			int v=scan.nextInt();
			int e=scan.nextInt();
			
			
			visited=new boolean[v+1];
			color=new boolean[v+1];
			list.clear();
			
			for(int j=0;j<v+1;j++) {
				
				list.add(new ArrayList<Integer>());
				
			}
			
			for(int j=0;j<e;j++) {
				int n1=scan.nextInt();
				
				int n2=scan.nextInt();
				
				list.get(n1).add(n2);
				list.get(n2).add(n1);
				
			}
			for(int j=1;j<v+1;j++) {
				if(!visited[j])
				dfs(j, true);
			}
		
			System.out.println(check());
			
		}
		
		
		
	}
	
	public static void dfs(int i,boolean c) {
		
		visited[i]=true;
		color[i]=c;
		for(int v : list.get(i)) {
			
			if(!visited[v]) {
				visited[v]=true;
				 dfs(v, !c);
				
			}
			
			
		}
		
	}
	public static String check() {
		
		for(int i=1;i<list.size();i++) {
			
			for(int j : list.get(i)) {
				
				if(color[j]==color[i]) {
					
					return "NO";
				}
				
				
			}
			
			
		}
		return "YES";
		
	}

}
 
