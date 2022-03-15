package baekjoon;

import java.util.Scanner;

public class Number_Less_Than_X_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num < x)
				System.out.print(num + " ");
		}
	}

}
