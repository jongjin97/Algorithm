package baekjoon;

import java.util.Scanner;

public class Plus_Cycle_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = num;
		int cnt = 0;
		do {
			int a = result/10;
			int b = result%10;
			int c= a+b;
			result = b*10 + c%10;
			cnt++;
		} while(num != result);
		System.out.println(cnt);
	}

}
