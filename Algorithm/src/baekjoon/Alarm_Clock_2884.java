package baekjoon;

import java.util.Scanner;

public class Alarm_Clock_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m  -= 45;
		
		if(m < 0) {
			m += 60;
			h -= 1;
		}
		if(h < 0)
			h = 23;
		System.out.println(h + " " + m);
	}

}
