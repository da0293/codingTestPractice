package practice;

import java.util.Scanner;
public class Main {
	public int solution(int n, int[] numArray){
		int answer = 1;  
		int max = numArray[0]; 
		for( int i = 0; i < numArray.length; i++) {
			if( numArray[i] > max) {
				answer++; 
				max = numArray[i]; 
			}
		}
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int[] numArray = new int[n];
		for(int i = 0; i < n; i++) {
			numArray[i] = sc.nextInt();
		}
		System.out.println(T.solution(n,numArray));
	}
}