package baekjoon;

import java.util.Scanner;

public class Plus_123_9095 {
	static int check;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int num = sc.nextInt();
			check =0;
			dfs(num, 0);
			System.out.println(check);
		}
	}
	
	public static void dfs(int num, int curr) {
		if(curr == num) {
			check++;
			return;
		}
		else if(curr > num)
			return;
		
		dfs(num, curr+1);
		dfs(num, curr+2);
		dfs(num, curr+3);
		
	}
}
