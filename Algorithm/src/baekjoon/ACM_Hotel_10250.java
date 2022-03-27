package baekjoon;

import java.util.Scanner;

public class ACM_Hotel_10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i=0; i<test; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			int x = 1;
			int y = 0;
			for(int j=0; j<n; j++) {
				if(y == h) {
					y = 1;
					x++;
				} else {
					y++;
				}
			}
			if(x < 10)
				System.out.println(y+"0"+x);
			else
				System.out.println(y+""+x);
		}
	}

}
