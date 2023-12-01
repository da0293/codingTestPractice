package practice;

import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		int lt = 0, rt = str.length()-1; 
		while(lt<rt) {
			if(ch[lt] == ch [rt]) {
				lt++;
				rt--; 
			}else {
				answer = "NO"; 
				break; 
			}
		}
		
		
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}