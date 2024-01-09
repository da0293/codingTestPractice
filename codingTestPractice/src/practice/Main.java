package practice;



import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {	
	public int solution(int n, int k, int[] arr) {
		int answer=-1; 
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		for( int i=0 ; i<n; i++) {
			for( int j=i+1; j<n; j++ ) {
				for( int t=j+1; t<n; t++) {
					ts.add(arr[i]+arr[j]+arr[t]);
				}
			}
		}
		int cnt=0; 
		for( int x : ts ) {
			cnt++; 
			if( cnt == k ) answer=x;
		}
		return answer; 
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}


