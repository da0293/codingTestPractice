package practice;

import java.util.Scanner;

public class Main {	
	public void DFS(int n) {
		System.out.print(n + " ");
		if(n==1) return; 
		DFS(n-1); 
	}
	public static void main(String[] args) {
		Main T = new Main();
		T.DFS(3);
	}
}
