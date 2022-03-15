package baekjoon;

import java.util.Scanner;

public class Sum_8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		for(int i=1; i<=num; i++){
			result += i;
		}
		System.out.println(result);
	}	

}
