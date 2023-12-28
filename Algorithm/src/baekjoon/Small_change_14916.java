package baekjoon;

import java.util.Scanner;

public class Small_change_14916 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] dp = new int[Math.max(6, N+1)];
        dp[2] = 1;
        dp[5] = 1;
        dp[4] = 2;
        for(int i=5; i<=N; i++){
            if(dp[i-2] != 0)
                dp[i] = dp[i-2]+1;
            if(dp[i-5] != 0)
                dp[i] = dp[i-5]+1;
            if(dp[i-5] != 0 && dp[i-2] != 0)
                dp[i] = Math.min(dp[i-2] +1, dp[i-5] + 1);
        }

        System.out.println(dp[N] == 0 ? -1 : dp[N]);
    }
}
