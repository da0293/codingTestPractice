package practice;

import java.util.Scanner;

public class Main {
	static int n; 
	static int[] ck; 
	public void DFS(int lev) {
		if(lev==n+1) {
			String tmp = ""; 
			for(int i=1; i<=n; i++) {
				if(ck[i]==1) tmp+=(i + " "); 
			}
			if(tmp.length()>0)System.out.println(tmp);
		}else {
			ck[lev]=1;
			DFS(lev+1); 
			ck[lev]=0; 
			DFS(lev+1); 
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ck = new int[n+1]; 
		T.DFS(1); 
	}
}
