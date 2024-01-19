package practice;



import java.util.Scanner;
import java.util.Stack;

public class Main {	
	public int solution(String str) {
		int answer = 0; 
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(i); // 여는 괄호의 인덱스를 스택에 저장
            } else {
                if (stack.peek() + 1 == i) {
                    // 레이저인 경우
                    stack.pop();
                    answer += stack.size();
                } else {
                    // 쇠막대기 끝인 경우
                    stack.pop();
                    answer++;
                }
            }
        }

		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(T.solution(s));
	}
}