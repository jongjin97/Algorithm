package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int[] num = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			num[i] = sc.nextInt();
		}
		
		Arrays.sort(num);
		for(int i : num)
			System.out.println(i);
	}
}
