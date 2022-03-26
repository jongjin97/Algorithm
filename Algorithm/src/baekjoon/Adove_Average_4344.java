package baekjoon;

import java.util.Scanner;

public class Adove_Average_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int size = sc.nextInt();
			int[] numarr = new int[size];
			int sum = 0;
			for(int j=0; j<size; j++) {
				numarr[j] = sc.nextInt();
				sum += numarr[j];
			}
			double up = 0;
			for(int j=0; j<size; j++) {
				if(sum/size < numarr[j])
					up++;
			}
			System.out.printf("%.3f%%\n", up/size*100);
		}
	}

}
