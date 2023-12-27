package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	public ArrayList<Integer> solution(int n, int m, int[] arr, int[] brr){
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr); 
		Arrays.sort(brr);
		for( int i=0; i<n; i++) {
			for( int j=0; j<m; j++) {
				if( arr[i]==brr[j] ) {
					answer.add(arr[i]);
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int[] arr = new int[n]; 
		for( int i=0; i<n; i++ ) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] brr = new int[m]; 
		for( int i=0; i<m; i++) {
			brr[i] = sc.nextInt();
		}
		for(int x: T.solution(n, m, arr, brr)) {
			System.out.print(x + " ");
		}
	}
}


