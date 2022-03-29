package baekjoon;

import java.util.Scanner;

public class Escape_From_Rectangle_1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result = 1000;
		result = result < Math.min(x, w-x) ? result : Math.min(x, w-x);
		result = result < Math.min(y, h-y) ? result : Math.min(y, h-y);
		
		System.out.println(result);
		
	}

}
