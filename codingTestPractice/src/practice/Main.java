package practice;

import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		String[] s = str.split(" ");
		int m = Integer.MIN_VALUE;
		for( String x : s ) {
			int len = x.length();
			if ( len > m ) {
				m = len; 
				answer = x; 
			}
		}
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(T.solution(str));
	}
}