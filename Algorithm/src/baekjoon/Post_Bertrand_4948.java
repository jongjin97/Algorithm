package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Post_Bertrand_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = a * 2;
			int cnt = 0;
			if(a == 0)
				break;
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
			
			for(int i=a+1; i<=b; i++) {
				if(primeList.get(i))
					cnt++;
			}
			System.out.println(cnt);
		}
	}

}
