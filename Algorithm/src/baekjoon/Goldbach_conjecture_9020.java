package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Goldbach_conjecture_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		ArrayList<Boolean> primeList = new ArrayList(10001);
		ArrayList<Integer> arr = new ArrayList();
		primeList.add(false);
		primeList.add(false);
		
		for(int j=2; j<=10000; j++) {
			primeList.add(true);
		}
		
		for(int j=2; (j*j)<=10000; j++) {
			if(primeList.get(j)) {
				for(int k=j*j; k<=10000; k+=j) {
					primeList.set(k, false);
				}
			}
		}
		for(int i=2; i<=10000; i++) {
			if(primeList.get(i))
				arr.add(i);	
		}
		
		for(int i=0; i<test; i++) {
			int num = sc.nextInt();
			int a = 0;
			int b = 0;
			for(int j=0; j<arr.size(); j++){
				if(arr.get(j) > num-arr.get(j))
					break;
				if(arr.contains(num-arr.get(j))) {
					a = arr.get(j);
					b = num-arr.get(j);
				}
			}
			System.out.println(a +" "+ b);
		}
	}

}
