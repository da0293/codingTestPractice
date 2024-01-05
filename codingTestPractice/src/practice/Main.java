package practice;



import java.util.HashMap;
import java.util.Scanner;

public class Main {	
	public int solution(String s, String t){
		int answer=0; 
		int sLen = s.length();
		int tLen = t.length();
		HashMap<Character, Integer> targetMap = new HashMap<>();
		HashMap<Character, Integer> windowMap= new HashMap<>();
		
		// 타겟 해시맵
		for( int i=0; i<tLen; i++ ){
			if(targetMap.containsKey(t.charAt(i))) targetMap.put(t.charAt(i), targetMap.get(t.charAt(i)+1));
			else targetMap.put(t.charAt(i), 1);
		}
		
		// 초기 윈도우 창
		for( int i=0; i<tLen; i++) {
			if(windowMap.containsKey(s.charAt(i))) windowMap.put(s.charAt(i), windowMap.get(s.charAt(i)+1));
			else windowMap.put(s.charAt(i), 1);
		}
		
		// 타겟 맵과 초기윈도우가 같으면 answer++;
		if(targetMap.equals(windowMap)) answer++; 
		
		// 윈도우맵과 타겟맵 비교
		int lt=0; 
		for( int rt=tLen; rt<sLen; rt++ ) {

			
		}
		
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(T.solution(s,t));
	}
}


