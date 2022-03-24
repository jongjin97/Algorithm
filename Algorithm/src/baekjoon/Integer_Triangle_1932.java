package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Integer_Triangle_1932 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[num][num];

		for (int i = 0; i < num; i++) {
			Arrays.fill(arr[i], 0);
			for(int j=0; j<=i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < num; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0)
					arr[i][j] += arr[i-1][j];
				else if(j==i)
					arr[i][j] += arr[i-1][j-1];
				else
					arr[i][j] += Math.max(arr[i-1][j], arr[i-1][j-1]);
			}
		}
		Arrays.sort(arr[num-1]);
		System.out.println(arr[num-1][num-1]);
	}

}
