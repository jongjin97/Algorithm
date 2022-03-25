package baekjoon;

import java.util.Scanner;

public class Oven_Clock_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		min += time;
		
		while(min >= 60) {
			min-= 60;
			hour++;
		}
		if(hour >= 24)
			hour -= 24;
		System.out.println(hour + " " + min);
	}

}
