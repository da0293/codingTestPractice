package practice;

import java.util.Scanner;

public class Main {
	public int solution(int n){
		int answer = 0;
		int[] ck =  new int[n+1]; 
		for( int i=2; i<n+1; i++ ) {
			if(ck[i]==0) {
				answer++; 
				for( int j=i; j<n+1; j+=i) {
					ck[j]=1; 
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(T.solution(n));
	}
}
