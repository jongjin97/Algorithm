package baekjoon;

import java.util.Scanner;

public class Find_Decimals_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<test; i++) {
			int num = sc.nextInt();
			
			for(int j=2; j<=num; j++) {
				if(num == j)
					cnt++;
				else if(num%j == 0)
					break;
			}
		}
		System.out.println(cnt);
	}

}
