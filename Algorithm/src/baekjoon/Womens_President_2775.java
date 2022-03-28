package baekjoon;

import java.util.Scanner;

public class Womens_President_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[k+1][n];
			for(int j=0; j<n; j++)
				arr[0][j] = j+1;
			
			for(int j=1; j<=k; j++) {
				for(int m=0; m<n; m++) {
					int sum = 0;
					for(int x=0; x<=m; x++) {
						sum+= arr[j-1][x];
						
					}
					arr[j][m] = sum;
				}
			}
			System.out.println(arr[k][n-1]);
		}
	}
}
