package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Right_Triangle_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int[] num = new int[3];
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			num[2] = sc.nextInt();

			Arrays.sort(num);
			if (num[0] == 0 && num[1] == 0 && num[2] == 0)
				break;
			
			if (num[0] * num[0] + num[1] * num[1] == num[2] * num[2])
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}

}
