package baekjoon;

import java.util.Scanner;

public class Dial_5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S')
				sum += 8;
			else if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V')
				sum += 9;
			else if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z')
				sum += 10;
			else
				sum += (str.charAt(i)-65) /3 + 3;
		}
		System.out.println(sum);
	}

}
