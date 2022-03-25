package baekjoon;

import java.util.Scanner;

public class AB_7_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i=1; i<=test; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			System.out.println("Case #"+i+": " + sum);
		}
	}

}
