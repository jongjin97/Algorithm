package baekjoon;

import java.util.Scanner;

public class Easy_number_of_stairs_10844 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int div = 1000000000;
        long[][] dp = new long[N+1][10];
        for(int i=1; i<10; i++){
            dp[1][i] = 1;
        }

        for(int i=2; i<dp.length; i++){
            for(int j=0; j<10; j++){
                if(j==0)
                    dp[i][j] = dp[i-1][j+1]%div;
                else if(j==9)
                    dp[i][j] = dp[i-1][j-1]%div;
                else
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%div;
            }
        }
        long sum = 0;
        for(int i=0; i<10; i++){
            sum += dp[N][i]%div;
        }
        System.out.println(sum%div);
    }
}
