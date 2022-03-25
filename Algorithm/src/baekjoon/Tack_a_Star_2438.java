package baekjoon;

import java.util.Scanner;

public class Tack_a_Star_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String result = "";
		
		for(int i=0; i<num; i++) {
			result += "*";
			System.out.println(result);
		}
	}

}
