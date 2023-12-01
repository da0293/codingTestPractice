package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<String> solution(String[] s) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : s ) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
	
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n]; 
		for( int i = 0; i < n ; i++ ) {
			s[i] = sc.next();
		}
		for( String x : T.solution(s)) {
			System.out.println(x);
		}
	}
}