package practice;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public ArrayList<Integer> solution(int n, int[] numArray){
		ArrayList<Integer> answer = new ArrayList<>(); 
		answer.add(numArray[0]); 
		for( int i = 1; i < n; i++ ) {
			if(numArray[i-1] < numArray[i]) {
				answer.add(numArray[i]); 
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

		for(int answer : T.solution(n,numArray)){
			System.out.print(answer +" ");
		}
	}
}