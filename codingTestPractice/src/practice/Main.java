package practice;



import java.util.Scanner;
import java.util.Stack;

public class Main {	
	public int solution(String str) {
		int answer = 0; 
		Stack<Integer> stack = new Stack<>();
		for( char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(Character.getNumericValue(x)); 
			}else {
				int b = stack.pop();
				int a = stack.pop();
				switch(x) {
				case '+':
					stack.push(a+b); 
					break;
				case '-':
					stack.push(a-b);
					break;
				case '*':
					stack.push(a*b);
					break;
				case '/':
					stack.push(a/b);
					break;
				}
			}
		}
		answer = stack.pop();
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(T.solution(s));
	}
}


