package practice;

import java.util.Scanner;

public class Main {
	
	public void DFS(int n) { // 11(5, 1) 5(2,1) 2(2
		if(n==0) return; 
		else {
			DFS(n/2); 
			System.out.print(n%2);
		}
		
	}


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        T.DFS(n);
       
    }
}
