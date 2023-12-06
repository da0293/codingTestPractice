package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = "" ;
		int cnt = 1; 
		for( int i = 0; i < str.length()-1; i++) {
			// 현재문자와 다음 문자가 같을 경우 1증가
			if (str.charAt(i) == str.charAt(i+1)) {
				cnt++; 
			} else {
				// 현재 문자와 다음 문자가 다를 경우 answer에 추가 
				answer += str.charAt(i);
				if( cnt > 1 ) answer += cnt; 
				cnt = 1; 
			}
		}
		// 마지막 문자 
		answer += str.charAt(str.length()-1);
		if( cnt > 1 ) answer+=cnt;
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}