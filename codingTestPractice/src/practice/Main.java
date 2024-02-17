package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	public int solution(int n, int c, int[] horses) {
		int answer=0; 
		Arrays.sort(horses); 
		int lt=1; 
		int rt=horses[n-1]-horses[0]; 
		System.out.println(lt);
		System.out.println(rt);
		while(lt<=rt) {
			int mid=(lt+rt)/2; 
			if(possible(horses, mid, c)) {
				rt=mid-1; 
			} else {
				lt=mid+1; 
				answer=mid; 
			}
		}
		return answer;
	}
	
	private boolean possible(int[] horses, int mid, int c) {
		int cnt=1, start=horses[0]; 
		int len=horses.length; 
		for(int i=0; i<len; i++) {
			if((horses[i]-start)>= mid) {
				start=horses[i]; 
				cnt++; 
			}
		}
		if(cnt<c)return true;
		else return false;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] horses = new int[n];
		for( int i=0; i<n; i++ ) {
			horses[i]=sc.nextInt();
		}
		System.out.println(T.solution(n, c, horses));
	}
}