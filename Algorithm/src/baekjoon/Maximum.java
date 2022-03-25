package baekjoon;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			if(num[i] > max) {
				max = num[i];
				cnt = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}

}
