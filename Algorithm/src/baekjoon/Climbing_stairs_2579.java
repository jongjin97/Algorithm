package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Climbing_stairs_2579 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] statirs;
        int[] dp;
        if(n >= 3) {
            dp = new int[n + 1];
            statirs = new int[n+1];
        }
        else {
            dp = new int[3];
            statirs = new int[3];
        }

        for(int i=1; i<=n; i++){
            statirs[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = statirs[1];
        dp[2] = statirs[2] + statirs[1];
        for(int i=3; i<=n; i++){
            dp[i] = + Math.max(dp[i-3] + statirs[i-1] + statirs[i], dp[i-2] + statirs[i]);
        }

        System.out.println(dp[n]);
    }
}
