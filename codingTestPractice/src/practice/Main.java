package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {	
	public String solution(String seq, String plan) {
		String answer = "YES"; 
		Queue<Character> Q = new LinkedList<>();
		for(char x : seq.toCharArray())Q.offer(x);
		for(char x : plan.toCharArray()) {
			if(Q.contains(x)) {
				if(x!=Q.poll())return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO"; 
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