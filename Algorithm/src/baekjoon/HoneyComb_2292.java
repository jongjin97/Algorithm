package baekjoon;

import java.util.Scanner;

public class HoneyComb_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 6 12 18
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = 1;
		int result = 1;
		while(tmp < num) {
			tmp += result * 6;
			result++;
		}
		System.out.println(result);
	}

}
