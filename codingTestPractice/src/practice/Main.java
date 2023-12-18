package practice;

import java.util.Scanner;

public class Main {	
	public int solution(int n, int[][] arr){
		int answer=0, max=Integer.MIN_VALUE;
		for( int i=1; i<=n; i++) {  // 사람 수 
			int cnt=0; 
			for(int j=1; j<=n; j++) {   // 사람 수 
				for(int k=1; k<=5; k++) { // 학년 수 
					if(arr[i][k]==arr[j][k]) { 
						cnt++;
						break; // 한사람이 2,3학년때 같은반일경우 2로 cnt가 되는것 막기위해
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer=i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6]; // [사람 수 +1][학년+1] //1~5를 맞춰서 쓰려고 
		for( int i=1; i<n+1; i++) { //  <사람 입력 수 +1
			for( int j = 1; j <=5; j++) { // <= 학년 수 
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
