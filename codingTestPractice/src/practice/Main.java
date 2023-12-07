package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = ""; 
		char[] c =  str.toCharArray();
		int cnt = 1; 
		for( int i = 0; i < str.length()-1; i++ ) {
			if (c[i] == c[i+1]) cnt++;
			else {
				answer += c[i]; 
				if( cnt > 1 ) answer += cnt; 
				cnt = 1; 
			}
		}
		answer += c[str.length()-1];  
		if( cnt > 1) answer+= cnt; 
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));

	}
}