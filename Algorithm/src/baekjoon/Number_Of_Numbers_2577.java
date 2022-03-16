package baekjoon;

import java.util.Scanner;

public class Number_Of_Numbers_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String num = Integer.toString(a*b*c);
		int[] arr = new int[10];
		
		for(int i=0; i<num.length(); i++) {
			arr[Integer.parseInt(Character.toString(num.charAt(i)))] += 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
