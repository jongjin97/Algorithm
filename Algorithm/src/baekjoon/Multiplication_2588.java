package baekjoon;

import java.util.Scanner;

public class Multiplication_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int bnum = b;
		for(int i=0; i<3; i++) {
			int num = bnum%10;
			bnum /= 10;
			System.out.println(a*num);
		}
		System.out.println(a*b);
	}

}
