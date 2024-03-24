package practice;

import java.util.Scanner;

public class Main {
	static int n; 
	static int[] fibo; 
	public int DFS(int n) {
		if(fibo[n]>0) return fibo[n]; 
		if(n==1) return 1; 
		else if(n==2) return 1; 
		else return DFS(n-2)+DFS(n-1); 
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1]; 
		for( int i=1; i<=n; i++ ) {
			System.out.print(T.DFS(i) + " ");
		}

	}
}
