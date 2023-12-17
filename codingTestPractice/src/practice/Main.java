package practice;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        
        int[] rowSum = new int[n]; 
        int[] colSum = new int[n]; 
        int diagonalSum1=0, diagonalSum2=0; 
        
        for( int y=0; y<n; y++) {
        	for( int x=0; x<n; x++) {
        		rowSum[y]+=arr[y][x];
        		colSum[x]+=arr[x][y]; 
        		
        		if(y==x) {
        			diagonalSum1+=arr[y][x];
        			diagonalSum2+=arr[y][n-1-x];
        		}
        	}	
        }
        
        for(int i=0; i<n; i++) {
        	answer=Math.max(rowSum[i], answer); 
        	answer=Math.max(colSum[i], answer);
        }
        
        answer=Math.max(diagonalSum1, answer);
        answer=Math.max(diagonalSum2, answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                arr[y][x] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
