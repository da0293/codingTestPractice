package practice;


import java.util.Scanner;

public class Main {	
	public int solution(int n){
		int answer = 0, lt=1, sum=0; 
		int half;
		if(n%2==1)half=n/2+1; 
		else half=n/2; 
		for( int rt=1; rt<=half; rt++ ) {
			sum+=rt; 
			while(sum>n) {
				sum-=lt++; 
			}
			if(sum==n)answer++; 
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}


