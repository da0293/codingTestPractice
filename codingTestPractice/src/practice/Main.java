package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	
	public int solution(int n, int m, int[] arr) {
		int answer=0; 
		/*
		 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
		 * 순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다.
		 * 1번 노래와 5번 노래를 같은 DVD에 녹화하기 위해서는 1번과 5번 사이의 모든 노래도 같은 DVD에 녹화해야 한다. 
		 * 또한 한 노래를 쪼개서 두 개의 DVD에 녹화하면 안된다.
		 * 지니레코드 입장에서는 이 DVD가 팔릴 것인지 확신할 수 없기 때문에 
		 * 이 사업에 낭비되는 DVD를 가급적 줄이려고 한다.
		 * 고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다. 
		 * 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
		 */
		// DVD의 크기용량 최소, 최대 범위
		// 크기용량이 최소 , 값 중 최대값이 최소용량 크기.노래가 쪼개지지않을 정도의 크기
		int lt=Arrays.stream(arr).max().getAsInt();
		// 크기 용량이 최대 , 모든 값을 다 한 곳에 넣을 때의 크기
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt) {
			int min=(lt+rt)/2; 
			int sum=0, cnt=0;  
			for( int i=0; i<n; i++ ) {
				sum+=arr[i];
				if(sum>min) {
					cnt++; 
					
				}
			}
		}

		
		
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for( int i=0; i<n; i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println(T.solution(n, m, arr));
	}
}