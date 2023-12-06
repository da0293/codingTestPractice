package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = "YES"; 
		str = str.toUpperCase();
		int lt = 0; 
		int rt = str.length()-1; 
		while(lt<rt) {
			if(str.charAt(lt) == str.charAt(rt)) {
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
		String s = sc.next();
		System.out.println(T.solution(s));
	}
}