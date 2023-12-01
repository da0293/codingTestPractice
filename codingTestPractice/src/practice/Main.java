package practice;

import java.util.Scanner;

public class Main {
	public int solution(String str) {
		int answer = 0; 
		String temp = ""; 
		for( char x : str.toCharArray()) {
			if( Character.isDigit(x)) temp+=x;  
		}
		answer = Integer.parseInt(temp); 
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}