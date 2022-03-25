package baekjoon;

import java.util.Scanner;

public class Factorization_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int plus = 2;
		
		while(num >= plus) {
			if(num % plus == 0) {
				num /= plus;
				System.out.println(plus);
				plus = 2;
			} else {
				plus++;
			}
		}
	}

}
