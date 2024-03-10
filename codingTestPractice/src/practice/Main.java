package practice;

import java.util.Scanner;


public class Main {	
	static int n, m, answer=Integer.MAX_VALUE; 
	public void DFS(int L, int sum, int[] arr ) { 
		if(sum>m)return; 
		if(L>=answer)return; 
		if(sum==m) {
			answer=Math.min(answer, L);
		}else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i], arr); 
			}
		}
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in); 
		n=sc.nextInt();
		int[] arr=new int[n];
		for( int i=0; i<n; i++ ) {
			arr[i] = sc.nextInt();
		}
		m=sc.nextInt();
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}