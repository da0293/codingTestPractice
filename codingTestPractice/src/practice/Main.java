package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0; 
		int rt = str.length()-1; 
		while(lt < rt ) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(s[rt])) {
				rt--; 
			} else {
				char temp = s[lt]; 
				s[lt] =  s[rt]; 
				s[rt] =  temp; 
				lt++;
				rt--; 
			}
		}
		answer = String.valueOf(s); 
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(T.solution(s));
	}
}