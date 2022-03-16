package baekjoon;

import java.util.Scanner;

public class RGB_Street_1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		int[][] arr = new int[test][3];
		
		for(int i=0; i<test; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
		
		for(int i=test-1; i>0; i--) {
			arr[i-1][0] += Math.min(arr[i][1], arr[i][2]);
			arr[i-1][1] += Math.min(arr[i][0], arr[i][2]);
			arr[i-1][2] += Math.min(arr[i][0], arr[i][1]);
		}
		System.out.println(Math.min(arr[0][0], Math.min(arr[0][1], arr[0][2])));
	}

}
