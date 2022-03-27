package baekjoon;

import java.util.Scanner;

public class Find_Fraction_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 1;
		int b = 1;
		boolean state = true;
		boolean state2 = true;
		for(int i=1; i<num; i++) {
			if(a == 1 && state) {
				b+=1;
				state = false;
				state2 = true;
			} else if(b == 1 && state) {
				a+=1;
				state = false;
				state2 = false;
			} else if(state2){
				a+=1;
				b-=1;
				state = true;
			} else if(!state2) {
				a-=1;
				b+=1;
				state = true;
			}
		}
		System.out.println(a+"/"+b);
	}
}
