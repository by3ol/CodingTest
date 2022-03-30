
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;



public class Main {

	static ArrayList<TreeSet<Integer>> list;
	static boolean[] visited;
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		
		int M=scan.nextInt();
		int start=scan.nextInt();
		
		
		visited=new boolean[1001];
		
		list=new ArrayList<TreeSet<Integer>>();
		
		for(int i=0;i<N+1;i++) {
			
			list.add(new TreeSet<Integer>());
		}
		
		for(int i=0;i<M;i++) {
			int s=scan.nextInt();
			
			int e=scan.nextInt();
			
			list.get(s).add(e);
			list.get(e).add(s);
			
			
		}
		

		dfs(start);
		
		Arrays.fill(visited, false);
		System.out.println();
		bfs(start);
		
	}
	
	public static void dfs(int i) {
		
		visited[i]=true;
		System.out.print(i+" ");
		
		for(int node : list.get(i)) {
			if(!visited[node]) {
				
				dfs(node);
			}
			
			
		}
		
		
	}
	public static void bfs(int i) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		visited[i]=true;
		
		q.add(i);
		
		while(!q.isEmpty()) {
			
			int n=q.poll();
			System.out.print(n+" ");
			
			for(int node : list.get(n)) {
				if(!visited[node]) {
					visited[node]=true;
					q.add(node);
					
				}
				
				
			}
			
		}
		
		
		
		
	}
}
