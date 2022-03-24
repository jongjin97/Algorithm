package baekjoon;

import java.util.Scanner;

public class twoxn_tiling_11727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] result = new int[num+1];
		
		if(num<2) {
			result[1] = 1;
		} else {
			result[1] = 1;
			result[2] = 3;
		}
		for(int i=3; i<=num; i++) {
			result[i] = (result[i-1] + 2*result[i-2])%10007;
		}
		System.out.println(result[num]);
		
	}
}
