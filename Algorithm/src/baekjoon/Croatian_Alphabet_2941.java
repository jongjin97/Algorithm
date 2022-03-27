package baekjoon;

import java.util.Scanner;

public class Croatian_Alphabet_2941 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			while(str.contains(arr[i])) {
				str = str.replaceFirst(arr[i], " ");
				cnt++;
			}
		}
		String[] sarr = str.split(" ");
		String tmp ="";
		for(String i : sarr) {
			if(!i.equals(""))
				tmp += i;
		}
		cnt += tmp.length();
		System.out.println(cnt);
	}

}
