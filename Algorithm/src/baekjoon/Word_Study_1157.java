package baekjoon;

import java.util.Scanner;

public class Word_Study_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase();
		int[] arr = new int[26];

		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)-65]++;
		}
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			} else if(max == arr[i]) {
				index = -1;
			}
		}
		
		char asc = (char) (index+65);
		if(index == -1)
			System.out.println("?");
		else {
			System.out.println(asc);	
		}
	}

}
