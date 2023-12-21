package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int n, int []arr){
		ArrayList<Integer> answer = new ArrayList<>();
		boolean isPrime=true; 
		for(int i=0; i<n; i++) {
			int a=arr[i]; 
			int temp=0; 
			while(a>0) {
				int remainder=a%10; 
				temp = (temp)*10+remainder;
				a=a/10; 
			}
			if(isPrime(temp)) answer.add(temp); 
		}
		return answer;
	}
	
	private boolean isPrime(int temp) {
		if( temp==1 )return false; 
		for( int i=2; i<temp; i++ ) {
			if(temp%i==0)return false; 
		}
		return true; 
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		for( int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for( int x : T.solution(n, arr) ) {
			System.out.print(x + " ");
		}
	}
}
