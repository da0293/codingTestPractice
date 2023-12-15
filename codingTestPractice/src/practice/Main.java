package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		int[] ck = new int[n]; 
		for( int i=0; i<n; i++ ) {
			int temp=arr[i]; 
			int reverse=0; 
			while(temp>0) {
				int t=temp%10; 
				reverse=reverse*10+t; 
				temp=temp/10; 
			}
			if(isPrime(reverse)) answer.add(reverse); 
		}
		return answer;
	}
	
	private boolean isPrime(int reverse) {
		if(reverse==1) return false;
		for( int i=2; i<reverse; i++) {
			if(reverse%i==0) return false; 
		}
		return true;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for( int i=0; i<n; i++ ) {
			arr[i]=sc.nextInt(); 
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x + " ");
		}
	}
}