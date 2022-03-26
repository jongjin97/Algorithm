package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;

public class Self_Number_4673 {
	static int[] arr = new int[10001];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<10001; i++) {
			self(i);
		}
		for(int i=1; i<10001; i++) {
			if(arr[i] == 0)
				System.out.println(i);
		}
	}
	public static void self(int num) {
		if(num >10000) {
			return;
		}
		int tmp = num;
		while(num != 0) {
			tmp += num%10;
			num/= 10;
		}
		if(tmp<= 10000) {
			arr[tmp] = 1;
		}
		self(tmp);
	}
}
