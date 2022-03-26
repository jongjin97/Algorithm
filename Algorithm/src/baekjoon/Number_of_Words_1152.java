package baekjoon;

import java.util.Scanner;

public class Number_of_Words_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String[] arr = str.split(" ");
		
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(""))
				continue;
			else
				cnt++;
		}
		System.out.println(cnt);
	}

}
