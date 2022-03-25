package baekjoon;

import java.util.Scanner;

public class Tack_a_Star_2_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			String str = "";
			for(int k=num; k>i; k--) {
				str +=" ";
			}
			
			for(int j=0; j<i; j++) {
				str+="*";
			}
			System.out.println(str);
		}
	}

}
