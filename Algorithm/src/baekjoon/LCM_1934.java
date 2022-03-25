package baekjoon;

import java.util.Scanner;

public class LCM_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0; i<test; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int gcf = 1;
			int lcm = 0;
			
			for(int j=1; j<=Math.min(num1, num2); j++) {
				if(num1%j == 0 && num2%j ==0)
					gcf = j;
			}
			
			lcm = num1*num2/gcf;
			System.out.println(lcm);
		}
	}
}
