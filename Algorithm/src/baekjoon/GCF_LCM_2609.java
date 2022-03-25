package baekjoon;

import java.util.Scanner;

public class GCF_LCM_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int gcf = 1;
		int lcm = 0;
		
		for(int i=1; i<=Math.min(num1, num2); i++) {
			if(num1%i == 0 && num2%i ==0)
				gcf = i;
		}
		
		lcm = num1*num2/gcf;
		System.out.println(gcf);
		System.out.println(lcm);
	}

}
