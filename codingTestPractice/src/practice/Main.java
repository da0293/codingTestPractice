package practice;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        for( int i=1; i<=n; i++ ) { // 멘토 학생 번호
        	for( int j=1; j<=n; j++) { // 멘티 학생 번호 
        		if( i==j ) continue;
        		boolean isMentor = true; 
        		for( int k=0; k<m; k++) { // 테스트 
        			int mentorRank=0; 
        			int menteeRank=0; 
        			for( int s=0; s<n; s++) { // 등수
        				if( arr[k][s]==i ) mentorRank=s;
        				if( arr[k][s]==j ) menteeRank=s;
        			}
        			if( mentorRank >= menteeRank ) {
        				isMentor=false; 
        				break; 
        			}
        		}
        		if(isMentor) answer++; 
        	}
        }
       return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}