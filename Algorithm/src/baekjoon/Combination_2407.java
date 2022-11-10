package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Combination_2407 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BigInteger[][] big = new BigInteger[N+1][N+1];
        big[0][0] = BigInteger.valueOf(1);
        big[1][0] = BigInteger.valueOf(1);
        big[1][1] = BigInteger.valueOf(1);

        for(int i=2; i<=N; i++){
            for(int j=0; j<=M; j++){
                big[i][j] = new BigInteger("0");
                if(i == 0 || j == 0) {
                    big[i][j] = BigInteger.valueOf(1);
                }
                else {
                    if(big[i - 1][j] == null)
                        big[i-1][j] = new BigInteger("0");
                    big[i][j] = big[i-1][j-1].add(big[i-1][j]);
                }
            }
        }

        System.out.println(big[N][M]);

    }

}
