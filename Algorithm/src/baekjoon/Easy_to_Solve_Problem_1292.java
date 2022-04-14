package baekjoon;

import java.util.Scanner;

public class Easy_to_Solve_Problem_1292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int[] arr = new int[end+1];
		
		int num = 1;
		int cnt = 0;

		for(int i=1; i<=end; i++) {
			arr[i] = num;
			cnt++;
			if(cnt==num) {
				num++;
				cnt=0;
			}
		}
		int result = 0;
		for(int i=start; i<=end; i++) {
			result += arr[i];
		}
		System.out.println(result);
	}

}
