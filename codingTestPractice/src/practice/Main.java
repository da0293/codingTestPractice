package practice;

import java.util.Scanner;

public class Main {
	public int solution(int n, int[][] arr){
		int answer = 0;
		int temp=0; 
		int sum1, sum2; 
		for( int y=0; y<n; y++ ) {
			sum1=0; sum2=0; 
			for( int x=0; x<n; x++) {
				sum1+=arr[y][x]; 
				sum2+=arr[x][y]; 
			}
			temp=Math.max(sum1,sum2); 
			if(temp>answer)answer=temp; 
		}
		sum1=0; sum2=0; 
		temp=0; 
		for( int i=0; i<n; i++ ) {
			sum1+=arr[i][i]; 
			sum2+=arr[n-1-i][i]; 
		}
		temp=Math.max(sum1, sum2); 
		if(temp>answer)answer=temp; 
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for( int y=0; y<n; y++ ) {
			for( int x=0; x<n; x++ ) {
				arr[y][x]=sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
