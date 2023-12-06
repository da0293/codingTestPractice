package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = "YES"; 
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp = new StringBuffer(str).reverse().toString();
		if(!str.equals(temp))answer="NO"; 
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(T.solution(s));
	}
}