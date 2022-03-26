package baekjoon;

import java.util.Scanner;

public class Arithmetic_Progression_1065 {
	static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Arith(num);
		
		System.out.println(cnt);
	}
	
	public static void Arith(int num) {
		if(num <= 0)
			return;
		String str = Integer.toString(num);
		String[] arr = str.split("");
		if(num >= 10) {
			int diff = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
			for(int i=0; i<arr.length-1; i++) {
				if(diff != Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+1]))
					break;
				else if(diff == Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+1]) && i == arr.length-2) {
					cnt++;
					break;
				}
			}
		}
		if(num<10)
			cnt++;
		Arith(num-1);
	}
}
