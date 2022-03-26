package baekjoon;

import java.util.Scanner;

public class Sum_of_Numbers_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		String[] arr= str.split("");
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
		
	}

}
