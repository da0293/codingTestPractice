package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	public int solution(int n, int c, int[] horses) {
		int answer=0; 
		// 1 2 4 8 9
		Arrays.sort(horses); 
		// lt : 두 말 사이의 최소값
		// rt : 두 말 사이의 최대값 
		int lt=1; 
		int rt=horses[n-1]-horses[0]; //8
		// 이진 탐색을 통한 결정 알고리즘 
		int cnt2=0; 
		while(lt<=rt) {
			// mid : 가장 가까운 두 말의 거리
			int mid=(lt+rt)/2; // 4
			if(possible(horses, mid, c)) {
				// while문을 더 돌기위해 이분탐색을 위한 rt값조정 
				rt=mid-1; 
			} else {
				// while문을 더 돌기위해 이분탐색을 위한 lt값조정
				lt=mid+1; 
				// 최적화값은 mid값이므로 answer에 그대로 들어간다.
				answer=mid; 
			}
		}
		return answer;
	}
	
	private boolean possible(int[] horses, int mid, int c) {
		// cnt : 말의 개수
		// start : 가장 최근에 배치한 말의 위치, 항상 0번인덱스부터 말을 무조건 넣고 시작하는 것이 좋다. 
		int cnt=1, start=horses[0]; 
		int len=horses.length; 
		for(int i=1; i<len; i++) {
			/*
			 * 이미 0번인덱스 좌표에 첫번째 말이 들어가 있는 상태다.
			 * 가장 가까운 두 말의 거리인 mid값보다 두 말 사이의 거리가 작으면 안된다.
			 * 따라서 horses[i]-start >= mid
			 * 시작점은 horses[i]로 옮긴다. 
			 * 말의 개수도 하나 늘어난다.
			 */	
			if((horses[i]-start)>= mid) {
				start=horses[i]; 
				cnt++; 
			}
		}
		// 말의 개수가 주어진 C마리보다 적으면 가장 가까운 두 말의 사이거리는 줄어들어야한다.
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