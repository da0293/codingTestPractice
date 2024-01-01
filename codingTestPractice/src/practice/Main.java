package practice;



import java.util.Scanner;

public class Main {	
	public int solution(int n, int k, int[] arr){
		int answer=0, sum=0, lt=0; ; 
		for( int i=0; i<k; i++) {
			sum+=arr[i]; 
		}
		answer = Math.max(answer, sum);
		for( int rt=k; rt<n; rt++) {
			sum+=(arr[rt]-arr[lt++]); 
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n]; 
		for( int i=0; i<n; i++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}


