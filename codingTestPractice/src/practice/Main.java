package practice;



import java.util.HashMap;
import java.util.Scanner;

public class Main {	
	public char solution(int n, String s){
		char answer= ' ';
		int max = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		for( char x: s.toCharArray()) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			} else {
				map.put(x, 1); 
			}
		}
		for( char key : map.keySet()) {
			int cnt = map.get(key);
			if(cnt>max) {
				max=cnt; 
				answer = key; 
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next(); 
		System.out.println(T.solution(n, s));
	}
}


