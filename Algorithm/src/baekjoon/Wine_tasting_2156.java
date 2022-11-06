package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Wine_tasting_2156 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[Math.max(3, n+1)];
        long[] dp = new long[Math.max(3, n+1)];
        for(int i=1; i<=n; i++){
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];
        dp[2] = wine[2] + wine[1];
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(wine[i] + dp[i-3] + wine[i-1], wine[i] + dp[i-2]);
            dp[i] = Math.max(dp[i-1], dp[i]);
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();
    }
}
