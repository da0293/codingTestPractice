package practice;


import java.util.Scanner;

public class Main {
	public int solution(int n, int [][]arr){
		int answer = 0; 
		int colSum[] = new int[n]; 
		int rowSum[] = new int[n]; 
 		int leftDiagonal=0, rightDiagonal=0; 
 		for(int y=0; y<n; y++) {
 			for( int x=0; x<n; x++) {
 				colSum[y]+=arr[y][x]; 
 				rowSum[y]+=arr[x][y]; 
 				if(y==x) {
 	 				leftDiagonal+=arr[y][x]; 
 	 			}
 				if((y+x)==(n-1)) {
 					rightDiagonal+=arr[y][x]; 
 				}
 			}
 		}
 		
 		for( int i=0; i<n; i++) {
 			answer=Math.max(answer, colSum[i]); 
 			answer=Math.max(answer, rowSum[i]);
 		}
 		answer= Math.max(leftDiagonal, answer);
 		answer= Math.max(rightDiagonal, answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for( int i=0; i< n; i++) {
			for( int j = 0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

