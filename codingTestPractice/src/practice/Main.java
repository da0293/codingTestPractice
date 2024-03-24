package practice;

import java.util.Scanner;

public class Main {
	static int n; 
	static int[] fibo; 
	public void DFS(int x) {
		if(x>n) {
			String tmp=""; 
			for(int i=1; i<=n; i++) {
				if(fibo[i]==1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}
		else {
			fibo[x]=1; 
			DFS(x+1); 
			fibo[x]=0; 
			DFS(x+1); 
		}
		
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		fibo = new int[n+1]; 
		T.DFS(1);
	}
}
