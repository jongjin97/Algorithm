package baekjoon;

import java.util.Scanner;

public class Decimal_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int min = 0;
		int sum = 0;
		
		for(int i=end; i>=start; i--) {
			for(int j=2; j<=i; j++) {
				if(i%j == 0 && i!=j)
					break;
				else if(i == j) {
					min = i;
					sum += i;
				}
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
