package baekjoon;

import java.util.Scanner;

public class Average_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] numarr = new double[num];
		double max = 0;
		double sum = 0;
		for(int i=0; i<num; i++) {
			numarr[i] = sc.nextInt();
			max = max > numarr[i] ? max : numarr[i];
		}
		
		for(int i=0; i<num; i++) {
			sum += numarr[i]/max*100;
		}
		System.out.println(sum/num);
		
	}

}
