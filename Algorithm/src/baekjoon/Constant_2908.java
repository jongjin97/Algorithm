package baekjoon;

import java.util.Scanner;

public class Constant_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		String tmp ="";
		String tmp2="";
		
		for(int i=0; i<3; i++) {
			tmp += Integer.toString(num1%10);
			tmp2 += Integer.toString(num2%10);
			num1/=10;
			num2/=10;
		}
		System.out.println(Math.max(Integer.parseInt(tmp), Integer.parseInt(tmp2)));
		
	}

}
