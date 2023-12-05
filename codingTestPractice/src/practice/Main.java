package practice;

import java.util.Scanner;
public class Main {
	public String solution(String str){
		String answer = "" ;
		int cnt = 1; 
		System.out.println("more");
		for( int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				System.out.println("첫번째 " + String.valueOf(str.charAt(i)));
				System.out.println(String.valueOf(str.charAt(i+1)));
				cnt++; 
			}else {
				answer += String.valueOf(str.charAt(i));
				if (cnt!=1)answer+=cnt; 
				cnt=1; 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}