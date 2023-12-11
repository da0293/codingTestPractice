package practice;

import java.util.Scanner;
public class Main {
	public String solution(int n, String str){
		String answer = ""; 
		String temp = "";
		int x = 0; 
		for(int i = 0; i < n; i++) {
			temp = str.substring(0,7).replace("#", "1").replace("*", "0"); ;
			x = Integer.parseInt(temp,2); 
			answer += (char)(x); 
			str =  str.substring(7); 
		}
		return answer; 
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n,str));

	}
}