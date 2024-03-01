package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {	
	static int n,m, answer=0; 
	static ArrayList<ArrayList<Integer>> graph; 
	static int[] ch; 
	public void DFS(int v) {
		if(v==n) answer++; 
		else {
			// graph.get(v) : v번 ArrayList
			// ArrayList는 forEach 가능
			for( int nv : graph.get(v) ) {
				if(ch[nv]==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0; 
				}
			}
		}
	}
	public static void main(String[] args) {
		Main t = new Main();
		Scanner sc = new Scanner(System.in); 
		n=sc.nextInt();
		m=sc.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1]; 
		for( int i=0; i<m; i++ ) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph.get(a).add(b); 
		}
		ch[1]=1; 
		t.DFS(1);
		System.out.println(answer);
	}
}