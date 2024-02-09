package practice;

import java.util.Scanner;

public class Main {	
	public int[] solution(int n, int[] arr) {
		// 선택정렬은 최소값 인덱스값을 변수에 저장함
		for( int i=0; i<n-1; i++ ) {
			int minIdx = i; 
			for( int j=i+1; j<n; j++ ) {
				if(arr[minIdx] > arr[j]) {
					minIdx=j; 
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
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