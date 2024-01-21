package practice;

import java.util.Scanner;

public class Main {	
	public String solution(String seq, String plan) {
		String answer = "NO"; 
		char[] s = seq.toCharArray();
		char[] p = plan.toCharArray();
		int sLen = s.length;
		int pLen = p.length;
		int sIndex=0; 
		for( int i=0; i<pLen; i++ ) {
			if(s[sIndex]==p[i]) {
				sIndex++; 
				if(sIndex==sLen) {
					answer = "YES";
					break; 
				}
			}
		}
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String seq = sc.next();
		String plan = sc.next();
		System.out.print(T.solution(seq, plan));
	}
}