package practice;

import java.util.Scanner;

public class Main {	
	static int n; 
	static int[] ch; 
	public void DFS(int L) {
		if(L==n+1) {
			// 모든 원소를 선택한 경우
			String tmp=""; 
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) tmp+=(i+ " ");
			}
			// 공집합 제외
			if(tmp.length()>0) System.out.println(tmp);
		}else {
			// 현재 위치의 원소를 선택한 경우
			ch[L]=1; 
			// 다음 위치로 이동하여 재귀적으로 탐색
			System.out.println("L  : " + L + " : " + 1);
			DFS(L+1); 
			System.out.println("L : " + L + " : 1에서 돌아옴");
			// 현재 위치의 원소를 선택하지 않은 경우
			ch[L]=0; 
			System.out.println("L : " + L + " : " + 0);
			// 다음 위치로 이동하여 재귀적으로 탐색
			DFS(L+1); 
			System.out.println("L : " + L + " : 0에서 돌아옴");
		}
	}
	// 이진 트리 생성, DFS 수행
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		// 자연수 N을 입력받음
		n = sc.nextInt();
		// 선택한 원소를 표시하는 배열 초기화
		ch = new int[n+1]; 
		T.DFS(1);
	}
}