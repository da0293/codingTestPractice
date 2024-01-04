package practice;



import java.util.HashMap;
import java.util.Scanner;

public class Main {	
	public String solution(String s1, String s2){
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for( char c1 : s1.toCharArray()) {
			if(map.containsKey(c1)) {
				map.put(c1, map.put(c1, map.get(c1)+1));
			} else {
				map.put(c1, 1);
			}
		}
		for( char c2 : s2.toCharArray()) {
			if(!map.containsKey(c2) || map.get(c2)==0) answer="NO";
			if(map.containsKey(c2)) {
				map.put(c2, map.put(c2, map.get(c2)-1));
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(T.solution(s1, s2));
	}
}


