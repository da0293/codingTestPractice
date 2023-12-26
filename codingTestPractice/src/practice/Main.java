package practice;


import java.util.Scanner;

public class Main {	
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		for( int i=1; i<=n; i++ ) {
			for( int j=1; j<=n; j++ ) {
				if( i==j )continue; 
				boolean isMentor=true;
				for( int t=0; t<m; t++ ) {
					int mentoRank=0; 
					int menteeRank=0; 
					for( int s=0; s<n; s++) {
						if(arr[t][s]==i) mentoRank=s; 
						if(arr[t][s]==j) menteeRank=s; 
					}
					if(mentoRank >= menteeRank) {
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
		int n =  sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n]; 
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n,m, arr));
	}
}


