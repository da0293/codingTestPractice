package practice;



import java.util.Scanner;
import java.util.Stack;

public class Main {	
	public int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0; 
		Stack<Integer> stack = new Stack<>();
		for( int movesX : moves ) {
			for( int y=0; y<n; y++ ) {
				int x = movesX-1;
				if(board[y][x]!=0) {
					int movesIndex=board[y][x];
					board[y][x]=0; 
					if(!stack.isEmpty()&& movesIndex==stack.peek()) {
						answer+=2; 
						stack.pop();
					}else {
						stack.push(movesIndex);
					}
					break; 
				}
			}
		}
		return answer; 
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for( int y=0; y<n; y++ ) {
			for( int x=0; x<n; x++) {
				board[y][x] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for( int i=0; i<m; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, board, m, moves));
	}
}


