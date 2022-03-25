package baekjoon;

import java.util.Scanner;

public class Three_Dice_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		int thr = sc.nextInt();
		boolean[] check = new boolean[3];
		int cnt = 1;
		int reulst = 0;
		int tmp = 0;
		
		if(fir == sec && fir == thr) {
			check[0] = true;
			check[1] = true;
			check[2] = true;
			cnt = 3;
			tmp = fir;
		}
		else if(fir == sec) {
			check[0] = true;
			check[1] = true;
			cnt = 2;
			tmp = fir;
		} else if(fir == thr) {
			check[0] = true;
			check[2] = true;
			cnt = 2;
			tmp = fir;
		} else if(sec == thr) {
			check[1] = true;
			check[2] = true;
			cnt = 2;
			tmp = sec;
		}
		
		if(cnt == 3)
			System.out.println(10000 + tmp * 1000);
		else if(cnt == 2)
			System.out.println(1000 + tmp*100);
		else
			System.out.println(Math.max(fir, Math.max(sec, thr)) * 100);
		
	}

}
