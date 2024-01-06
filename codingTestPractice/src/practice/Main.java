package practice;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {	
	public int solution(int n, int k, int[] a) {
		int answer =-1;
		TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
		// 아무것도 없으면 오름차순,  Collections.reverseOrder() 내림차순 
		for( int i=0; i<n-2; i++) {
			for(int j=i+1; j<n-1; j++) {
				for(int l=j+1; l<n; l++) {
					ts.add(a[i]+a[j]+a[l]); // .add는 set자료구조에서 추가할 때 사용
				}
			}
		}
		int cnt=0;
		for(int x: ts) { // Treeset하나씩 빼올때 
			cnt++; //cnt가 마치 내림차순한 배열 인덱스 같다. 
			if(cnt==k)return x; 		
		}
		return answer; 
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print(T.solution(n, k, a));
	}
}


