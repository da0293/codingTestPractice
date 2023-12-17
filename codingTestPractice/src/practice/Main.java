package practice;

import java.util.Scanner;

public class Main {
	int[] dx= { -1, 0, 1, 0 };
	int[] dy= { 0, 1, 0, -1 };
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int y=0; y<n; y++) {
        	for(int x=0; x<n; x++) {
        		boolean flag=true; 
        		for( int k=0; k<4; k++) {
        			// 해당 좌표의 상하좌우 좌표값
        			int nx=dx[k]+x; 
        			int ny=dy[k]+y;
        			// 봉우리가 아닌 것 먼저 구하기
        			// ArrayIndexOutOfBoundaryError를 방지 하기위해 nx>=0 && nx<n && ny>=0 && ny<n 먼저 설젇
        			if( nx>=0 && nx<n && ny>=0 && ny<n && arr[ny][nx]>=arr[y][x]) {
        				flag=false;
        				break; 
        			}
        		}
        		if(flag) answer++; 
        	}
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                arr[y][x] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
