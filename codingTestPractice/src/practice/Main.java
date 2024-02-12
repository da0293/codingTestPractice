package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int x;
	int y; 
	public Point(int x, int y) {
		this.x=x; 
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return o.y-this.y;
		else return o.x-this.x;
	}
}
public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for( int i=0; i<n; i++ ) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			arr.add(new Point(x,y));
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(Point o :  arr) {
			System.out.println(o.x+ " " +o.y);
		}
	}
}