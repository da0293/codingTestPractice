package practice;

import java.util.Scanner;

public class Main {	
	
	public int[] solution(int n, int[] arr) {
		// 최소값 인덱스를 바꿔치기 
		for( int i=0; i<n-1; i++) {
			int idx=i; 
			for( int j=i+1; j<n; j++) {
				if(arr[idx]>arr[j]) {
					idx=j; 
				}
			}
			int temp = arr[idx]; 
			arr[idx] = arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		for( int i=0; i<n; i++ ) {
			arr[i] = sc.nextInt();
		}
		for( int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}