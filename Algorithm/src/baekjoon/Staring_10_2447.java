package baekjoon;

import java.util.Scanner;

public class Staring_10_2447 {
	static char[][] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		arr = new char[num][num];
		star(0,0,num,false);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num; i++) {
			for(int j=0;j<num;j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	public static void star(int x, int y, int n, boolean check) {
		if(check) {
			for(int i=x; i<x+n; i++) {
				for(int j=y; j<y+n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n==1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = n/3;
		int count = 0;
		for(int i=x; i<x+n; i+=size) {
			for(int j=y; j<y+n; j+=size) {
				count++;
				if(count == 5)
					star(i,j,size, true);
				else
					star(i,j,size, false);
			}
		}
	}
}
