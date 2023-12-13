package practice;

import java.util.Scanner;
public class Main {
	public int solution(int n, int[] numArray){
		int answer = n; 
		for( int y = 1; y < numArray.length; y++) {
			for( int x = 0 ; x < y; x++) {
				if(numArray[y] <= numArray[x]) {
					answer--; 
					break; 

				}
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