package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int[] num = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0] + " " + num[cnt-1]);
		
		
	}

}
