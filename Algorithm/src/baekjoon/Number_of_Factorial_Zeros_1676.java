package baekjoon;

import java.util.Scanner;

public class Number_of_Factorial_Zeros_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		for(int i=5; i<=num; i+=5) {
			if(i %125 == 0)
				result += 3;
			else if(i%25 == 0)
				result += 2;
			else if(i%5 == 0)
				result ++;
		}
		
		System.out.println(result);
	}

}
