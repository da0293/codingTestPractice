package practice;


import java.util.Scanner;

public class Main {	
	public int solution(int n, int m, int[] arr){
		int answer = 0, start=0, sum=0; 
		for( int i=0; i<n; i++ ) {
			sum+=arr[i]; 
			if(sum==m) {
				answer++;	
				i=start++; 
				sum=0; 
			}
			else if( sum > m ) {
				i=start++; 
				sum=0; 
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n]; 
		for( int i=0; i<n; i++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}


