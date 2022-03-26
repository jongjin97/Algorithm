package baekjoon;

import java.util.Scanner;

public class OX_Quize_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			String str = sc.next();
			String[] arr = str.split("");
			int cnt = 1;
			int sum = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j].equals("O")) {
					sum += cnt;
					cnt++;
				} else {
					cnt = 1;
				}
			}
			System.out.println(sum);
		}
	}

}
