package baekjoon;

import java.util.Scanner;

public class Big_Number_AB_10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String[] str = a.split("");
		String[] str2 = b.split("");
		int[] arr = new int[a.length()];
		int[] barr = new int[b.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		for(int i=0; i<barr.length; i++) {
			barr[i] = Integer.parseInt(str2[i]);
		}
		int leng1 =arr.length;
		int leng2 = barr.length;
		while(leng1 != 0 && leng2 != 0) {
			leng1 -=1;
			leng2 -=1;
			if(leng1 >= leng2) 
				arr[leng1] = arr[leng1] + barr[leng2];
			
			else 
				barr[leng2] = arr[leng1] + barr[leng2];
			
		}
		
		if(leng1 >= leng2) {
			for(int i=arr.length-1; i>0; i--) {
				if(arr[i] >= 10) {
					arr[i] -= 10;
					arr[i-1] +=1;
				}
			}
			for(int i : arr)
				System.out.print(i);
		} else {
			for(int i=barr.length-1; i>0; i--) {
				if(barr[i] >= 10) {
					barr[i] -= 10;
					barr[i-1] +=1;
				}
			}
			for(int i : barr)
				System.out.print(i);
		}
	}

}
