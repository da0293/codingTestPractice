package practice;


import java.util.Scanner;

public class Main {	
	public int solution(int n, int k, int[] arr){
		int answer = 0, sum=0; 
		for(int i=0; i<k; i++) sum+=arr[i]; 
		answer=sum; // 초기 윈도우 설정
		for(int i=k; i<n; i++) { 
			sum+=(arr[i]-arr[i-k]); // 윈도우 맨 앞 수는 제외, 배열의 새로운 수는 합침
			answer=Math.max(answer,sum); // 최대값 설정
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


