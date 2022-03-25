package baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Remain_3052 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			set.add(num%42);
		}
		System.out.println(set.size());
	}

}
