package baekjoon;

import java.util.Scanner;

public class Pick_A_Quadrant_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 0 && b > 0)
			System.out.println(1);
		else if (a > 0 && b < 0)
			System.out.println(4);
		else if (a < 0 && b > 0)
			System.out.println(2);
		else
			System.out.println(3);
	}

}