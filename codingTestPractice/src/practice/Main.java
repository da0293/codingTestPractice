package practice;

import java.util.Scanner;
public class Main {
	public int solution(int n){
		int answer = 0;
		// 임의의 ck배열을 n+1 배열로 만드는건 인덱스번호를 자연수라고 여김
		int[] ck = new int[n+1];
		for( int i=2; i<=n; i++) {
			if( ck[i]==0 ) {
				answer++; 
				// i의 배수로 for문을 돈다.
				for( int x=i; x<=n; x=x+i) ck[x]=1; 
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