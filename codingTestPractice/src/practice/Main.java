package practice;

import java.util.Scanner;
public class Main {
	public int solution(String str){
		String temp  = ""; 
		for( int i = 0; i < str.length(); i++ ) {
			if(Character.isDigit(str.charAt(i))) temp += str.charAt(i);
		}
		int answer = Integer.parseInt(temp);
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
	}
}