package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_Decimals_1929 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		ArrayList<Boolean> primeList;

		primeList = new ArrayList<Boolean>(b+1);
		
		primeList.add(false);
		primeList.add(false);
		
		for(int i=2; i<=b; i++ )
			primeList.add(i, true);
		
		for(int i=2; (i*i)<=b; i++) {
			if(primeList.get(i)) {
				for(int j= i*i; j<=b; j+=i)
					primeList.set(j, false);
			}
		}
		
		for(int i=a; i<primeList.size(); i++) {
			if(primeList.get(i))
				System.out.println(i);
		}
	}
}
