package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	public String solution(String seq, String plan) {
		String answer = "NO"; 
		Queue<Integer> Q = new LinkedList<>();
		char[] s = seq.toCharArray();
		char[] p = plan.toCharArray();
		int sIndex=0; 
		for( int i=0; i<p.length; i++ ) {
			if(s[sIndex]==p[i]) {
				sIndex++; 
				if(sIndex==s.length) {
					answer="YES"; 
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