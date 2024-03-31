package practice;

import java.util.Scanner;

public class Main {
	
	public int DFS(int n) { // 11(5, 1) 5(2,1) 2(2
		if(n==1) return 1;  
		else {
			return n*DFS(n-1); 
		}
		
	}


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(T.DFS(n));
       
    }
}
