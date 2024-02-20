package practice;

import java.util.Scanner;

public class Main {	
	/*
	 * D(5) 5*DFS(4)를 리턴받음 -> D(4) 4*DFS(3)을 리턴받음
	 * -> D(3) 3*DFS(2)를 리턴받음 -> D(2) 2*DFS(1)을 리턴받음 -> 1 리턴받고 pop
	 */
	public int DFS(int n) {
		if(n==1) return 1; 
		else return n*DFS(n-1); 
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		System.out.println(T.DFS(n));
	}
}