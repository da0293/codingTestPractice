package practice;

import java.util.Scanner;

public class Main {	
	static int n; 
	static int[] ch; 
	public void DFS(int L) {
		if(L==n+1) {
			String tmp=""; 
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) tmp+=(i+ " ");
			}
			// 공집합 제외
			if(tmp.length()>0) System.out.println(tmp);
		}else {
			ch[L]=1; 
			DFS(L+1); 
			ch[L]=0; 
			DFS(L+1); 
		}
	}
	// 이진 트리 생성, DFS 수행
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		T.DFS(1);
	}
}