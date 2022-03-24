package baekjoon;

import java.util.Scanner;

public class twoxn_tiling_11726 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long result[] = new long[num+1];
		if(num < 2) {
			result[1] = 1;
		} else {
			result[1] = 1;
			result[2] = 2;
		}
		for(int i=3; i<=num; i++) {
			result[i] = (result[i-1] + result[i-2])%10007;
		}

		System.out.println(result[num]);
	}
	// 1 2 3 4 5 6  7  8  9
	// 1 2 3 5 8 13 21 34 55
}
