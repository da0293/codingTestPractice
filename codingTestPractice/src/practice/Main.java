package practice;

import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		char[] ch = str.toCharArray();
		int lt = 0; int rt = str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(ch[lt]))lt++;
			else if (!Character.isAlphabetic(ch[rt]))rt--;
			else {
				char temp = ch[lt]; 
				ch[lt] = ch[rt]; 
				ch[rt] = temp;
				lt++; 
				rt--;  
			}
		}
		answer = String.valueOf(ch);
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}