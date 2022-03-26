package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class FInd_The_Alphabet_10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = str.charAt(0);
		// a = 97
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)-97] == -1)
				arr[str.charAt(i)-97] = i;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
