package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	int[] dis = {-1,1,5}; 
	int[] ck; 
	public int BFS(int s, int e) {
		ck = new int[10001]; 
		ck[s] = 1; 
		Queue<Integer> q = new LinkedList<>();
		q.offer(s);
		int lev=0;
		while(!q.isEmpty()) {
			int len = q.size();
			// 해당 레벨 for문 돌기
			for(int i=0; i<len; i++) {
				// 큐에서 좌표 꺼냄 
				int x = q.poll();
				// 한 좌표당 앞으로 1, 뒤로 -1, 앞으로 5 즉 3가지 경우가 있다. 
				for(int j=0; j<3; j++) {
					// 해당좌표에 경우의 수 더함 
					int nx = x+dis[j]; 
					// 그 레벨이 거리값과 같다. 그래서 송아지좌표와 같다면 lev 리턴
					if(nx==e) return lev++; 
					// 좌표의 범위가 1~100000이므로 이것 지킴 
					// 그리고 해당 좌표(nx)가 아직 방문되지 않았을 때 큐에 추가 
					if(nx >=1 && nx<=10000 && ck[nx]==0) {
						ck[nx]=1; 
						q.offer(nx); 
					}
					
				}
			}
			lev++; 
		}
		return 0; 
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in); 
		// 현수 위치
		int s = sc.nextInt();
		// 송아지 위치
		int e = sc.nextInt();
		System.out.println(T.BFS(s,e));
		
	}
}
