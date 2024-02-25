package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	// 최소 횟수 카운트
	int answer=0; 
	// 전진 1칸, 후진 1칸, 전진 5칸 
	int[] dis= {1, -1, 5}; 
	// 체크배열, 한번 방문한것은 큐에 넣지않겠다 
	static int[] ch; 
	// 갈 수 있는 위치를 저장할 Q 
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch=new int[10001]; 
		// 출발지점 체크
		ch[s]=1; 
		Q.offer(s); 
		// level은 점프횟수와 같다. 
		int lev=0; 
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0; i<len; i++) {
				int x=Q.poll();
				if(x==e) return lev; 
				for(int j=0; j<3; j++) {
					int nx=x+dis[j]; 
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx]=1; 
						Q.offer(nx); 
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
		// 현재 위치(현수의 위치)
		int s=sc.nextInt();
		// 송아지 위치
		int e=sc.nextInt();
		ch=new int[10001]; 
		// 출발지점 체크
		System.out.println(T.BFS(s,e));
	}
}