package practice;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int n, int []arr){
		ArrayList<Integer> answer = new ArrayList<>();		
		for( int i=0; i<arr.length; i++ ) {
			int rank=1;  
			for( int j=0; j<arr.length; j++ ) {
				if(arr[i]<arr[j]) {
					rank++;
				}
			}
			answer.add(rank); 
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for( int i=0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		for( int x : T.solution(n, arr)) {
			System.out.print(x +" ");
		}
	}
}

