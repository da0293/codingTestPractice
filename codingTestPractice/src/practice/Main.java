package practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int n, m; 
	static int[] ck; 
	static int[] dis; 
	static ArrayList<ArrayList<Integer>> graph; 
	
	public void BFS(int start) {
		Queue<Integer> q = new LinkedList<>(); 
		ck[start]=1; 
		dis[start]=0; 
		q.offer(start); 
		while(!q.isEmpty()) {
			int current = q.poll(); 
			for( int next : graph.get(current)) {
				if(ck[next]==0) {
					ck[next]=1; 
					dis[next]=dis[current]+1; 
					q.offer(next); 
				}
			}
			
			
		}
		
	}


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ck = new int[n+1]; 
        dis = new int[n+1]; 
        graph = new ArrayList<ArrayList<Integer>>(); 
        for(int i=0; i<=n; i++) {
        	graph.add(new ArrayList<Integer>()); 
        }
        for( int i=0; i<m; i++ ) {
        	int a = sc.nextInt(); 
        	int b = sc.nextInt(); 
        	graph.get(a).add(b); 
        }
        T.BFS(1); 
        for(int i=2; i<=n; i++) {
        	System.out.println(i + " : " +dis[i]);
        }
    }
}
