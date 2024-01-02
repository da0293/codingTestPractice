package practice;



import java.util.Scanner;

public class Main {	
	public int solution(int n){
		int answer=0, sum=0, lt=0; 
		int m = n/2+1;
		int[] a= new int[m];
		for(int i=0; i<m; i++) a[i]=i+1; // 자연수니까 i+1함 
		for( int rt=0; rt<m; rt++ ) {
			sum+=a[rt]; 
			while(sum>n) {
				sum-=a[lt++];
			}
			if(sum==n)answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
	}
}


