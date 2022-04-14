package baekjoon;

import java.util.Scanner;

public class Sieve_of_Eratosthenes_2960 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		boolean[] check = new boolean[N + 1];
		int cnt = 0;
		for (int i = 2; i <= N; i++) {
			if (!check[i]) {
				check[i] = true;
				cnt++;
			}
			if (cnt == K) {
				System.out.println(i);
				break;
			}
			for (int j = i; j <= N; j += i) {
				if (!check[j]) {
					check[j] = true;
					cnt++;
				}
				if (cnt == K) {
					System.out.println(j);
					break;
				}
			}
			if (cnt == K) {
				break;
			}

		}
	}

}
