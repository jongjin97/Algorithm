package programmers;

import java.util.Arrays;

public class Small_change {
    public int solution(int n, int[] money) {
        int answer = 0;

        int[] dp = new int[n+1];

        // 1 1 1 1 1
        // 1 2 2 3 3
        // 1 2 2 3 4
        dp[0] = 1;
        for(int i=0; i<money.length; i++){
            for(int j=money[i]; j<dp.length; j++){
                dp[j] += dp[j-money[i]];
            }
        }
        for(int i=0; i<dp.length; i++){
            System.out.println(dp[i]);
        }
        return dp[n];
    }

}
