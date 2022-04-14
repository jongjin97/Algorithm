package baekjoon;

import java.util.Scanner;

public class Room_Number_1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int room = sc.nextInt();
		
		int[] num = new int[10];
		
		while(room != 0) {
			num[room%10] += 1;
			room/=10;
		}
		int max =0;
		int num2 =0;
		for(int i=0; i<10; i++) {
			if(i == 6 || i == 9) {
				num2 += num[i];
			} else {
				max = Math.max(max, num[i]);
			}
		}
		if(num2%2 == 0) {
			num2 /= 2;
		} else {
			num2 /= 2;
			num2++;
		}
		System.out.println(Math.max(max, num2));
	}

}
