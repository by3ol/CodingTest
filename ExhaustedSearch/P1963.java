import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		boolean[] prime=new boolean[10000];
		HashSet<Integer>[] graph=new HashSet[10000];
		
		
		
		for(int i=2;i<10000;i++) {
			
			if(!prime[i]) {
				
				for(int j=2;i*j<10000;j++) {
					
					prime[i*j]=true;
					
					
				}
				
				
			}
			
			graph[i]=new HashSet<Integer>();
			
		}
		
		
		for(int i=1000;i<10000;i++) {
			
			if(!prime[i]) {
				
				
				
				
				String number=String.valueOf(i);
				
				String thousand=String.valueOf(number.charAt(0));
				String hundred=String.valueOf(number.charAt(1));
				String ten=String.valueOf(number.charAt(2));
				String one=String.valueOf(number.charAt(3));
				
				for(int j=0;j<10;j++) {
				
					
					String str=thousand+hundred+ten+j;
					int nextNum=Integer.parseInt(str);
					
					if(!prime[nextNum] && nextNum!=i) {
						
						graph[i].add(nextNum);
					}
					
					str=thousand+hundred+j+one;
					nextNum=Integer.parseInt(str);
					
					if(!prime[nextNum] && nextNum!=i) {
						
						graph[i].add(nextNum);
					}
					
					str=thousand+j+ten+one;
					nextNum=Integer.parseInt(str);
					
					if(!prime[nextNum] && nextNum!=i) {
						
						graph[i].add(nextNum);
					}
					
					
					
				}
				
				for(int j=1;j<10;j++) {
					
					String str=j+hundred+ten+one;
					int nextNum=Integer.parseInt(str);
					
					if(!prime[nextNum] && nextNum!=i) {
						
						graph[i].add(nextNum);
					}
					
				}
				
				
				
				
			}
				
				
			
		}
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		boolean[] visited=new boolean[10000];
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			
			int min=Integer.MAX_VALUE;
			
			Arrays.fill(visited, false);
			
			Queue<Obj> q=new LinkedList<Obj>();
			
			visited[start]=true;
			
			q.add(new Obj(start,0));
			
			while(!q.isEmpty()) {
				
				Obj obj=q.poll();
				
				if(obj.node==end) {
					
					min=obj.dis;
					break;
				}
				
				for(int j : graph[obj.node]) {
					
					if(!visited[j]) {
						
						visited[j]=true;
						q.add(new Obj(j,obj.dis+1));
					}
					
				}
				
			}
			
			
			if(min==Integer.MAX_VALUE) {
				
				System.out.println("Impossible");
			}else {
				
				System.out.println(min);
			}
			
			
			
		}
		
		
		
		
		
		
	}

}

class Obj{
	
	int node;
	int dis;
	
	public Obj(int node,int dis) {
		
		this.node=node;
		this.dis=dis;
	}
	
}
